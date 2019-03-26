package com.mapr.chicos;

import com.mapr.chicos.model.*;
import org.ojai.Document;
import org.ojai.DocumentStream;
import org.ojai.json.Json;
import org.ojai.store.*;
import org.ojai.types.OTimestamp;

import java.text.SimpleDateFormat;
import java.util.*;

public class OJAI_003_ChicosCustomerCRUD {

    public static final String TABLE_PATH = "/user/mapr/chicos/customer";

    private static Connection connection;


    public static void main(String[] args) {

        try {
            initializeConnection();

            findAllRecord();
//
//            createCustomerRecord();
//
//            findByID("1+55003065");
//
            appendCustomerCoupon("1+55003065");
//
//            updateCustomerRecord("1+55003057");

//
            queryWithSelectCondition();


        } finally {
            closeConnection();
        }

    }

    private static void queryWithSelectCondition() {
        System.out.println("===========Query with select and condition=============");

        DocumentStream documentStream;
        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            final QueryCondition queryCondition = connection.newCondition()
                        .is("brand_id", QueryCondition.Op.GREATER_OR_EQUAL, 1)
//                        .is("contact_email_pii[0].email_address", QueryCondition.Op.EQUAL,"abc@xyz.com")
//                        .is("customer_coupon[0].coupon.brand_id", QueryCondition.Op.EQUAL, 5)
                    .build();

            final Query query = connection.newQuery()
                    .select("_id","contact_email_pii[0].email_address","customer_coupon[0].coupon.brand_id")
                    .where(queryCondition)
                    .where("{\"$eq\": {\"contact_email_pii[0].email_address\": \"abc@xyz.com\"}}")
                    .where("{\"$exists\":\"customer_coupon[0].coupon.brand_id\"}")
                    .build();

            documentStream = documentStore.find(query);
        }
        for (Document document:documentStream)
              {
                  System.out.println(document.asJsonString());


        }



    }

    private static void appendCustomerCoupon(String id) {
        System.out.println("===========Append Customer Coupon=============");

        DocumentStore documentStore = connection.getStore(TABLE_PATH);

        Document document = documentStore.findById(id);

        if (document!= null){




            Coupon coupon = new Coupon();
            coupon.setBrandId(5);
            coupon.setValidFrom("2/4/2019 12:00:00 AM");
            coupon.setValidTo("3/3/2019 12:00:00 AM");


            Campaign campaign = new Campaign();

            campaign.setCampaignSk(555);

            CustomerCoupon customerCoupon = new CustomerCoupon();

            customerCoupon.setCouponId(555);
            customerCoupon.setDateLastModified(new Date().toString());

            customerCoupon.setCoupon(coupon);
            customerCoupon.setCampaign(campaign);


            Document document1 = Json.newDocument(customerCoupon);

            DocumentMutation documentMutation = connection.newMutation()
                    .append("customer_coupon",Collections.singletonList(document1));

            documentStore.update(id,documentMutation);
            documentStore.flush();
            documentStore.close();


        } else {
            System.out.println("Document is not found for _id: "+id);
        }



    }

    private static void createCustomerRecord() {
        System.out.println("===========Create Customer Record=============");


        //Contact email
        ContactEmailPius contactEmailPius = new ContactEmailPius();

        contactEmailPius.setEmailAddress("abc@xyz.com");
        contactEmailPius.setDateLastModified(new Date().toString());
        contactEmailPius.setDepricatedEmailId(123456);
        contactEmailPius.setMain(true);

        List<ContactEmailPius> contactEmailPiusList = new ArrayList<>();
        contactEmailPiusList.add(contactEmailPius);


        //Coupon record
        Coupon coupon = new Coupon();

        coupon.setBrandId(1);
        coupon.setTreatmentCode("111111");
        coupon.setValidFrom("5/4/2016 12:00:00 AM");
        coupon.setValidTo("6/4/2016 12:00:00 AM");

        //Campaign
        Campaign campaign = new Campaign();

        campaign.setCampaignSk(1111);
        campaign.setCampaignStartDate("ABC Campaign");
        campaign.setCampaignType(1);

        //Customer Coupon
        CustomerCoupon customerCoupon = new CustomerCoupon();

        customerCoupon.setCouponId(1111);
        customerCoupon.setLastUsedStore("xyz store");
        customerCoupon.setUsedCount(1);

        customerCoupon.setCoupon(coupon);
        customerCoupon.setCampaign(campaign);

        List<CustomerCoupon> customerCouponList = new ArrayList<>();
        customerCouponList.add(customerCoupon);

        //Customer Loyalty type

        LoyaltyType loyaltyType = new LoyaltyType();

        loyaltyType.setLoyaltyTypeCode("ABC");
        loyaltyType.setLoyaltyTypeDesc("ABC Desc");

        //Customer Loyalty

        CustomerLoyalty customerLoyalty = new CustomerLoyalty();

        customerLoyalty.setLoyaltyTypeId(1);
        customerLoyalty.setLifetimeSpend(1234.56);
        customerLoyalty.setLoyaltyFlag(true);

        customerLoyalty.setLoyaltyType(loyaltyType);

        List<CustomerLoyalty> customerLoyaltyList = new ArrayList<>();
        customerLoyaltyList.add(customerLoyalty);

        //Customer
        Customer customer = new Customer();

        customer.setBrandId(1);
        customer.setCustomerNo(55003065);
        customer.setId(customer.getBrandId().toString()+"+"+customer.getCustomerNo().toString());
        customer.setFirstName("Som");
        customer.setLastName("M");
        customer.setContactEmailPii(contactEmailPiusList);
        customer.setCustomerCoupon(customerCouponList);
        customer.setCustomerLoyalty(customerLoyaltyList);



        DocumentStore documentStore = connection.getStore(TABLE_PATH);

        Document document = Json.newDocument(customer);

        documentStore.insertOrReplace(document);

        documentStore.close();

    }

    private static void updateCustomerRecord(String id) {
        System.out.println("===========Update Simple Record=============");

        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            Document document = documentStore.findById(id);

            if (document != null) {

//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//                Calendar calendar = new GregorianCalendar();
//
//                System.out.println(simpleDateFormat.format(calendar.getTime()));
//
//                calendar.add(Calendar.DATE, 365);
//
////                Date date = calendar.getTime();
//
//                System.out.println(simpleDateFormat.format(calendar.getTime()));




                DocumentMutation documentMutation = connection.newMutation()
//                        .set("birth_month", 12)
                        .set("last_name","Bond")
                        .set("contact_mail_pii[0].date_valid_to", new Date().toString())
                        .set("contact_mail_pii[0].opt_out", true)
                        .set("customer_loyalty[0].loyalty_type.loyalty_type_desc","Updated XYZ");


                documentStore.update(id, documentMutation);
                documentStore.flush();

            }else {
                System.out.println("Document not found with _id: " + id);
            }

        }


    }

    private static void findByID(String id) {

        System.out.println("===========Find By ID =============");

        Document document;
        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            document = documentStore.findById(id);
        }

        System.out.println("Document => "+ document);

    }

    private static void findAllRecord() {

        System.out.println("===========Find All Records=============");
        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            DocumentStream documentStream = documentStore.find();

            for (Document document: documentStream
                 ) {
                System.out.println(document.asJsonString());
            }
        }


    }

    private static void closeConnection() {
        connection.close();
        System.out.println("===========Connection closed=============");
    }

    private static void initializeConnection() {


        connection = DriverManager.getConnection("ojai:mapr:");
        System.out.println("===========Connection Established=============");
    }
}

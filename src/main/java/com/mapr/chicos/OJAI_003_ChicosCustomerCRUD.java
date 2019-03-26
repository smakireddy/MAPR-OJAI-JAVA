package com.mapr.chicos;

import com.mapr.chicos.model.*;
import org.ojai.Document;
import org.ojai.DocumentStream;
import org.ojai.json.Json;
import org.ojai.store.Connection;
import org.ojai.store.DocumentMutation;
import org.ojai.store.DocumentStore;
import org.ojai.store.DriverManager;
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
            createCustomerRecord();
//
            findByID("1+55003065");
//
//            appendTransactionSummary("1+123401562");
//
            updateSimpleRecord("1+55003057");
//
//            updateNestedRecord("1+123401562");
//
//            queryWithSelectCondition();


        } finally {
            closeConnection();
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

    private static void updateSimpleRecord(String id) {
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

//                documentStore.

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

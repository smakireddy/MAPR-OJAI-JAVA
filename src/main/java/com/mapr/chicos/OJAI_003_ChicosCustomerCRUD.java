package com.mapr.chicos;

import org.ojai.Document;
import org.ojai.DocumentStream;
import org.ojai.store.Connection;
import org.ojai.store.DocumentMutation;
import org.ojai.store.DocumentStore;
import org.ojai.store.DriverManager;
import org.ojai.types.OTimestamp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OJAI_003_ChicosCustomerCRUD {

    public static final String TABLE_PATH = "/user/mapr/chicos/customer";

    private static Connection connection;

    public static void main(String[] args) {

        try {
            initializeConnection();

            findAllRecord();
//
//            createWarehouseRecord("1+123401562");
//
            findByID("1+55003057");
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

                System.out.println("inside if ");

                DocumentMutation documentMutation = connection.newMutation()
//                        .set("birth_month", 12)
                        .set("last_name","Bond-1")
//                        .set("contact_mail_pii[0].date_valid_to", OTimestamp.parse(simpleDateFormat.format(calendar.getTime())))
//                        .set("contact_mail_pii[0].opt_out", true)
                        ;

                System.out.println("after mutations");
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

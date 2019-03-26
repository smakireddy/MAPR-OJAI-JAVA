package com.mapr.chicos;


import com.mapr.chicos.model.SasWhouseCmItemBrandChanTransSum;
import com.mapr.chicos.model.WarehouseRecordJSON;
import org.ojai.Document;
import org.ojai.DocumentStream;
import org.ojai.json.Json;
import org.ojai.store.*;
import org.ojai.types.OTimestamp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.ojai.store.QueryCondition.*;


public class OJAI_002_ChicosSummaryCRUD {
    public static final String TABLE_PATH = "/user/mapr/chicos/house";

    private static Connection connection;

    public static void main(String[] args) {

        try {
            initializeConnection();

            findAllRecord();

//            createWarehouseRecord("1+123401565");

//            findByID("1+123401563");

//            appendTransactionSummary("1+123401565");

//            updateSimpleRecord("1+123401562");

//            updateNestedRecord("1+123401562");

//            queryWithSelectCondition();

            addColumetoExistingRow("1+123401565");


        } finally {
            closeConnection();
        }

    }

    private static void addColumetoExistingRow(String id) {
        System.out.println("===========Add Column to Existing Record=============");

        final DocumentStore documentStore = connection.getStore(TABLE_PATH);

        QueryCondition queryCondition = connection.newCondition()
                .notExists("newColumn")
                .close();

        DocumentMutation documentMutation = connection.newMutation()
                .set("newColumn","newValue");

        documentStore.checkAndUpdate(id,queryCondition,documentMutation);

        documentStore.close();

    }

    private static void createWarehouseRecord(String id) {

        System.out.println("===========Create Warehouse Record=============");


        final DocumentStore documentStore = connection.getStore(TABLE_PATH);

        SasWhouseCmItemBrandChanTransSum t = new SasWhouseCmItemBrandChanTransSum();

        t.setDepartmentCode(9999);
        t.setTotalUnitCntLifetime(2);
        t.setCouponTransCnt37plusM(2);
        t.setTotalSalesAmtLifetime(222.222);
        t.setIndividualSk(6415989);
        t.setChannelId(1);
        t.setProcessedDttm(new OTimestamp(new java.util.Date()));
        t.setLastTransDt(new OTimestamp(new java.util.Date()));
        t.setTotalSalesAmt37plusM(222.22);
        t.setFirstTransDt("25MAY2019:09:09:00");
        t.setItemBrandId(1);
        t.setTransCntLifetime(10);
        t.setTotalUnitCnt37plusM(10);
        t.setTotalUnitCnt37plusM(10);
        t.setGrossMarginAmt37plusM(222.22);
        t.setGrossMarginAmtLifetime(0.11);
        t.setGrossMarginPct37plusM(222.22);
        t.setGrossMarginPctLifetime(0.11);

        List<SasWhouseCmItemBrandChanTransSum> sasWhouseCmItemBrandChanTransSumList = Arrays.asList(t);

//
//        WarehouseRecordJSON tran= new WarehouseRecordJSON();
//        tran.setId("1+123401564");
//        SasWhouseCmItemBrandChanTransSum item= new SasWhouseCmItemBrandChanTransSum();
//        item.setChannelId(101);
//        List<SasWhouseCmItemBrandChanTransSum> list= new ArrayList<SasWhouseCmItemBrandChanTransSum>();
//        list.add(item);
//        tran.setSasWhouseCmItemBrandChanTransSum(list);
//        Document newdoc=Json.newDocument(tran);
//        documentStore.insert(newdoc);

//        documentStore.insertOrReplace(id, warehouseDocument);

        WarehouseRecordJSON warehouseRecordJSON = new WarehouseRecordJSON();
        warehouseRecordJSON.setId(id);
        warehouseRecordJSON.setAddressLastUpdateDttm(new java.util.Date().toString());
        warehouseRecordJSON.setSasWhouseCmItemBrandChanTransSum(sasWhouseCmItemBrandChanTransSumList);

        Document document = Json.newDocument(warehouseRecordJSON);

        documentStore.insertOrReplace(document);

        documentStore.close();


    }

    private static void queryWithSelectCondition() {
        System.out.println("===========Query with Select and Condition=============");

        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            final QueryCondition queryCondition = connection.newCondition()
                    .is("depricated_customer_sk", Op.EQUAL, 2648961)
                    .build();

            final Query query = connection.newQuery()
                    .where(queryCondition)
                    .build();

            final DocumentStream stream = documentStore.find(query);

            for (final Document document : stream) {
                System.out.println(document.asJsonString());
            }
        }

    }

    private static void findByID(String id) {
        System.out.println("===========Find by ID =============");


        DocumentStore documentStore = connection.getStore(TABLE_PATH);

        Document document = documentStore.findById(id);

        System.out.println("Document => "+ document);
    }

    private static void updateNestedRecord(String id) {

        System.out.println("===========Update Nested Record=============");

        DocumentStore documentStore = connection.getStore(TABLE_PATH);
        Document byId = documentStore.findById(id);

        if(byId!=null){

          DocumentMutation documentMutation = connection.newMutation()
                  .set("sas_whouse_cm_item_brand_chan_trans_sum[1].total_sales_amt_37plus_m", 9999.99)
                  .increment("sas_whouse_cm_item_brand_chan_trans_sum[1].individual_sk", 1);

          documentStore.update(id,documentMutation);

          System.out.println( "\t"+ documentStore.findById(id).getList("sas_whouse_cm_item_brand_chan_trans_sum").toString() );

          findByID(id);

            System.out.println("Current Date and Time : "+new java.util.Date());


        }else {
            System.out.println("Document not found with _id: " + id);
        }


    }

    //Find all records in table
    private static void findAllRecord() {

        System.out.println("============Find All Records============");
        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            DocumentStream documentStream = documentStore.find();
            for (final Document document : documentStream
            ) {
                System.out.println(document.asJsonString());
            }

        }
    }

    //Update simple record.
    private static void updateSimpleRecord(String id) {

        System.out.println("============update simple record============");
        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            Document document = documentStore.findById(id);

            if (document != null) {

                DocumentMutation documentMutation = connection.newMutation()
                        .set("total_sales_amt_lifetime", 2820.18);

                documentStore.update(id, documentMutation);

                documentStore.flush();
            } else {
                System.out.println("Document not found with _id: " + id);
            }
        }

    }

    //Append transaction summary with new transaction summary model record.
    private static void appendTransactionSummary(String id) {

        System.out.println("============Append Transaction Summary============");

        try (DocumentStore documentStore = connection.getStore(TABLE_PATH)) {

            Document document = documentStore.findById(id);


            if (document != null) {

//
//
//                t.setDepartment_code(9999);
//                t.setTotal_unit_cnt_lifetime(1);
//                t.setCoupon_trans_cnt_37plus_m(1);
//                t.setTotal_sales_amt_lifetime(111.11);
//                t.setIndividual_sk(6415989);
//                t.setChannel_id(1);
////                t.setProcessed_dttm(new OTimestamp(new java.util.Date()));
//                t.setProcessed_dttm(OTimestamp.parse("2019-03-29T12:33:22.000Z"));
//                t.setLast_trans_dt(ODate.parse("2019-03-21"));
//                t.setTotal_sales_amt_37plus_m(1111.111);
//                t.setFirst_trans_dt("07MAR2013:09:09:00");
//                t.setItem_brand_id(1);
//                t.setTrans_cnt_lifetime(10);
//                t.setTotal_unit_cnt_37plus_m(10);
//                t.setTrans_cnt_37plus_m(10);
//                t.setGross_margin_amt_37plus_m(1111.11);
//                t.setGross_margin_amt_lifetime(0.11);
//                t.setGross_margin_pct_37plus_m(1111.11);
//                t.setGross_margin_pct_lifetime(0.11);

                SasWhouseCmItemBrandChanTransSum sasWhouseCmItemBrandChanTransSum = new SasWhouseCmItemBrandChanTransSum();

                sasWhouseCmItemBrandChanTransSum.setDepartmentCode(9999);
                sasWhouseCmItemBrandChanTransSum.setTotalUnitCntLifetime(222);

                Document document1 = Json.newDocument(sasWhouseCmItemBrandChanTransSum);

                DocumentMutation documentMutation = connection.newMutation().
                        append("sas_whouse_cm_item_brand_chan_trans_sum", Collections.singletonList(document1));

                documentStore.update(id, documentMutation);

                documentStore.flush();

            } else {
                System.out.println("Document not found with _id: " + id);
            }
        }

    }

    // Close connection.
    private static void closeConnection() {
        connection.close();
        System.out.println("============Connection Closed============");
    }

    // Establish connection
    private static void initializeConnection() {

        connection = DriverManager.getConnection("ojai:mapr:");
        System.out.println("============Connection Initialized============");
    }

}
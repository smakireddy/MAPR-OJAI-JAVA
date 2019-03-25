package com.mapr.chicos;

import org.ojai.Document;
import org.ojai.store.Connection;
import org.ojai.store.DocumentStore;
import org.ojai.store.DriverManager;

public class OJAI_001_FindByID {
    public static void main(String[] args){

        System.out.println("--------Starting Application--------");

        final Connection connection = DriverManager.getConnection("ojai:mapr:");
        final DocumentStore documentStore = connection.getStore("/user/mapr/chicos/house");

        final Document document = documentStore.findById("1+123401560");

        System.out.println(document.asJsonString());
        documentStore.close();

        System.out.println("--------End Application--------");


    }
}

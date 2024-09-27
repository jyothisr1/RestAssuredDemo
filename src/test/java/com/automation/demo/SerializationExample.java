package com.automation.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerializationExample {
    public static void main(String[] args) throws Exception {
//        String content=getDataFromFile("src/test/resources/json/create_booking.json");
//        System.out.println(content);
//        ObjectMapper mapper=new ObjectMapper();
//        CreateBookingPojo createBookingPojo=mapper.readValue(content,CreateBookingPojo.class);
//        createBookingPojo.setDepositpaid(false);
////        System.out.println(createBookingPojo.getFirstname());
//
//
//    }
//    public static String getDataFromFile(String filePath) throws FileNotFoundException {
//        String context = new Scanner(new FileInputStream(filePath)).useDelimiter("\\Z").next();
//        return context;
    }
}

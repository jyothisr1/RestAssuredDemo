package com.automation.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
//                .log().all().when().get("/booking")
//                .then().log().all().assertThat().statusCode(200);

//        String body = getDataFromFile("src/test/resources/json/create_booking.json");
//
//        RequestSpecification requestSpecs = RestAssured.given();
//
//        requestSpecs = requestSpecs.baseUri("https://restful-booker.herokuapp.com");
//
//        requestSpecs = requestSpecs.body(body);
//
//        requestSpecs = requestSpecs.contentType("application/json");
//
//        Response response = requestSpecs.post("/booking");

//        System.out.println(response.getStatusCode());
//        System.out.println(response.prettyPrint());
//        System.out.println(response.asString());

//        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
//                .body(body).contentType("application/json")
//                .log().all().when().post("/booking")
//                .then().log().all().assertThat().statusCode(200);
    }

    public static String getDataFromFile(String filePath) throws FileNotFoundException {
        String context = new Scanner(new FileInputStream(filePath)).useDelimiter("\\Z").next();
        return context;
    }
}

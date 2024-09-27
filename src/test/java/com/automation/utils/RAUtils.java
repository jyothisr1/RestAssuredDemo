package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RAUtils {
//    static RestAssured restAssured;
    static RequestSpecification specification=RestAssured.given();
    static Response response;
    static String endPoint;
    public static void setEndpoint(String endp){
        RAUtils.endPoint=endp;
    }
    public static Response post(){
        specification=specification.log().all();
        response=specification.post();
        response.then().log().all();
        return response;
    }

    public static Response get(){
        specification=specification.log().all();
        response=specification.get();
        response.then().log().all();
        return response;
    }
    public static void header(String key,String value){
        ConfigReader.setConfig(key,value);
    }
}

package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {
    @Before
    public void setUp(){

        ConfigReader.initConfig();
        RestAssured.baseURI="https://restful-booker.herokuapp.com";
    }
    @After
    public void cleanUp(){

    }
}

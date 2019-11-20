package com.studentapp.testbase;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
    }
}



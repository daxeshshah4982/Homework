package com.studentapp.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {

    @Test
    public void getAllStudentInformation() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);

//        ValidatableResponse response1 = given()
//                .when()
//                .get("/list")
//                .then()
//                .statusCode(200);
        System.out.println(response.toString());
        System.out.println(response.print());
        System.out.println(response.prettyPrint());
        System.out.println(response.then().toString());

    }

    @Test
    public void getSingleStudentInformation() {
        Response response = given()
                .when()
                .get("/2");
        response.then().statusCode(200);
        System.out.println(response.print());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void getSingleStudentInformationWithParameter() {
        Response response = given()
                .param("programme", "Computer Science")
                .param("limit", "5")
                .when()
                .get("/list");

        response.then().log().all().statusCode(200);
    }

    @Test
    public void getStudentInformationFromFirstName() {
        Response response = given()
                // .param("firstName","Vernon")
                // .param("limit","2")
                .when()
                .get("/list");
        response.then().log().all().statusCode(200);

    }

    //get student information from id 35 to 44
    @Test
    public void getMultipleStudent() {
        for (int i = 35; i < 45; i++) {

            Response response = given()
                    .when()
                    .get(String.valueOf(i));
            response.then().log().all().statusCode(200);

        }
    }


}
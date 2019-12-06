package com.example.restapi.dummy;

import com.example.restapi.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeMethod extends TestBase {

    @Test
    public void getAllEmployeeData() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("/employees");
        response.then().assertThat()
                .header("Content-Type", "text/html; charset=UTF-8")
                .and().statusCode(200)
                .log().all();
    }

    @Test
    public void getSingleEmployeeData() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("employee/1");
        response.then().assertThat()
                .header("Accept-Ranges", "bytes")
                .and().header("Content-Type", "text/html; charset=UTF-8")
                .and().statusCode(200)
                .log().all();

    }
}

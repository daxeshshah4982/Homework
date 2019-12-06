package com.example.restapi.dummy;

import com.example.restapi.dummy.testbase.TestBase;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;


public class DeleteEmployeeMethod extends TestBase {

    @Test
    public void deleteEmployeeData(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .delete("/delete/1");
        response.then().assertThat().statusCode(200).log().all();

    }
}

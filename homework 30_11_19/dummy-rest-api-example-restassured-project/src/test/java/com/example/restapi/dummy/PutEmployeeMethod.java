package com.example.restapi.dummy;

import com.example.restapi.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutEmployeeMethod extends TestBase {

    @Test
    public void updateEmployeeData(){
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body("{\"name\":\"tj546kest1454\",\"salary\":\"1120123\",\"age\":\"20\"}")
                .put("/update/1");
        response.then().assertThat().statusCode(200).log().all();
    }
}

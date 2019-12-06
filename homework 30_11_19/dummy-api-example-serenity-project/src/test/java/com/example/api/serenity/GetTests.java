package com.example.api.serenity;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.RestRequests.given;

@RunWith(SerenityRunner.class)
public class GetTests extends TestBase {

    @Test
    public void getAllEmployeeData() {
        SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .get("/employees")
                .then()
                .statusCode(200)
                .and().header("Content-Type", "text/html; charset=UTF-8")
                .and().header("Accept-Ranges", "bytes")
                .log()
                .all();
    }

    @Test
    public void getSingleEmployeeData(){
        SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .get("employee/1")
                .then()
                .statusCode(200)
                .and().header("Content-Type", "text/html; charset=UTF-8")
                .and().header("Accept-Ranges", "bytes")
                .log()
                .all();
    }
}

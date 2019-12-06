package com.example.api.serenity;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class DeleteTests extends TestBase {

    @Test
    public void deleteEmployeeData() {
        SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/delete/14667")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}

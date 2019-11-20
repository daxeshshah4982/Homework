package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class FirstSerenityTest extends TestBase {

    @Test
    public void getAllStudents(){
        SerenityRest.rest().given()
                .when()
                .get("/list")
                .then()
                .statusCode(200).log().all();
    }
}

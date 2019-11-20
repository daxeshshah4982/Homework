package com.studentapp.studentinfo;

import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.lang3.Validate;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {
    /* given()
     * set cookies,add auth,adding parameters,setting header info
     * .when()
     * GET,POST,PUT,DELETE..etc
     * .then()
     *  Validate status code,extract response, extract headers,cookies,extract the response body
     *
     */
    @Test
    public void deleteSingleRecord() {
        Response response = given()
                //.contentType(ContentType.JSON)
                .header("Content-Type", "application/json")
                .when()
                .delete("/10");
        response.then().log().all().statusCode(204);
    }

    // delete multiple records at same time
    @Test
    public void deleteMultipleRecords() {
        for (int i = 61; i < 71; i++) {

            Response response = given()
                    .header("Content-Type", "application/json")
                    .when()
                    .delete(String.valueOf(i));
            response.then().log().all().statusCode(204);
        }
    }
}

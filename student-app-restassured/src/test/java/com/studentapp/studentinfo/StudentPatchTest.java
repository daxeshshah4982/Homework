package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.sessionId;

public class StudentPatchTest extends TestBase {
    /* given()
     * set cookies,add auth,adding parameters,setting header info
     * .when()
     * GET,POST,PUT,DELETE..etc
     * .then()
     *  Validate status code,extract response, extract headers,cookies,extract the response body
     *
     */

    // patch = update single record  ( here we don't need to write all the field, for single change no need to bring all
    // data's as we were taking in put
    @Test
    public void patchSingleRecord() {
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Matthew" + (int) (Math.random()) * 3000 + 1);
        studentPojo.setEmail("matthewperry@hotmail.com");

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/1");
        response.then().log().all().statusCode(200);
    }

    // here Changed email because if I would change other field and not email than in for loop it will give an error of
    // same email field
    @Test
    public void patchMultipleRecords() {

        StudentPojo studentPojo = new StudentPojo();

        for (int i = 31; i < 41; i++) {
//            Response response = given()
//                    .when()
//                    .get(String.valueOf(i));
//            response.then().log().all().statusCode(200);

            studentPojo.setFirstName("Matthew" + (int) (Math.random()) * 3000 + i);
             studentPojo.setEmail((int)(Math.random())*2500 + i +"mattleblank@yahoo.co.uk");

            Response response1 = given()
                    .header("Content-Type", "application/json")
                    .when()
                    .body(studentPojo)
                    .patch(String.valueOf(i));
            response1.then().log().all().statusCode(200);

        }
    }

}

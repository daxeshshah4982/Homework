package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
    /* given()
     * set cookies,add auth,adding parameters,setting header info
     * .when()
     * GET,POST,PUT,DELETE..etc
     * .then()
     *  Validate status code,extract response, extract headers,cookies,extract the response body
     *
     */
    // put = update single record
    @Test
    public void editStudentRecord() {
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Courtney" + (int) (Math.random() * 5000 + 1));
        studentPojo.setLastName("Kudro");
        studentPojo.setEmail("lisakudro@gmail.com");
        studentPojo.setProgramme("Computer Science");
        List<String> courses = new ArrayList<>();
        courses.add("Accounting");
        courses.add("Statistics");

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/101");
        response.then().log().all().statusCode(200);
    }

    // put = update multiple records at same time
    // here Changed email because if I will not change email field than will give an error of same email field
    // here we are writing cases for put so we are changing writing all fields from studentpojo which is not necessary in patch
    @Test
    public void editMultipleRecords() {
        StudentPojo studentPojo = new StudentPojo();

        for (int i = 81; i < 91; i++) {
            studentPojo.setFirstName("David");
            studentPojo.setLastName("Schwimmer" + (int) (Math.random()) * 2000 + 1);
            studentPojo.setEmail((int) (Math.random()) * 2000 + i + "davidSchimmer@yahoomail.com");
            studentPojo.setProgramme("Software Testing");
            List<String> courses = new ArrayList<>();
            courses.add("Java");
            courses.add("Jira");

            Response response = given()
                    .header("Content-Type", "application/json")
                    .when()
                    .body(studentPojo)
                    .put(String.valueOf(i));
            response.then().log().all().statusCode(200);

        }

    }


}

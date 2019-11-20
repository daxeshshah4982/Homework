package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.studentinfo.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {

    @Test
    public void createNewStudent() {
        List<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("c++");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Jennifer");
        studentPojo.setLastName("Anniston");
        studentPojo.setEmail("jenniferanniston@gmail.co.uk");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courses);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
    }

    @Test
    /* given()
     * set cookies,add auth,adding parameters,setting header info
     * .when()
     * GET,POST,PUT,DELETE..etc
     * .then()
     *  Validate status code,extract response, extract headers,cookies,extract the response body
     *
     */
    public void createTenStudent() {

        List<String> courses = new ArrayList<>();
        courses.add("Statistics");
        courses.add("Mathematics");

        StudentPojo studentPojo = new StudentPojo();
        for (int i = 0; i < 10; i++) {

            studentPojo.setFirstName("Jennifer" + (int) (Math.random() * 5000 + 1));
            studentPojo.setLastName("Anniston" + (int) (Math.random() * 5000 + 1));
            studentPojo.setEmail((int) (Math.random() * 5000 + 1) + "anniston@gmail.com");
            studentPojo.setProgramme("Computer Analysis");
            studentPojo.setCourses(courses);

            Response response = given()
                    .header("Content-Type", "application/json")
                    .when()
                    .body(studentPojo)
                    .post();
            response.then().log().all().statusCode(201);
        }
    }

}

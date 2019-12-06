package com.example.api.serenity;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class PostTests extends TestBase {
    static String name = "daxesh"+ Math.random()*50;
    static int salary = 12345;
    static int age = 35;

    @Test
    public void createNewData(){
        EmployeePojo employeePojo = new EmployeePojo();

        employeePojo.setName(name);
        employeePojo.setSalary(salary);
        employeePojo.setAge(age);

        SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .body(employeePojo)
                .post("/create")
                .then()
                .log().all().statusCode(200);

    }
}

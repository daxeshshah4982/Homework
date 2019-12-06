package com.example.api.serenity;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class PutTests extends TestBase {
    static String name = "daxesh" + Math.random() * 50;
    static int salary = 12345;
    static int age = 25;

    @Test
    public void updateEmployeeData(){
        EmployeePojo employeePojo = new EmployeePojo();

        employeePojo.setName(name);
        employeePojo.setSalary(salary);
        employeePojo.setAge(age);

        SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .body(employeePojo)
                .put("/update/1")
                .then()
                .statusCode(200)
                .log()
                .all();
    }



}

package com.example.api.serenity;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

public class EmployeeSerenitySteps extends TestBase {


    @Title("Create new employee with valid information")
    @UseTestDataFrom("src/test/java/com/example/api/serenity/resources/employeedata.csv")
    @Step("create new employee with name:{0},salary:{1},age:{2}")
    public ValidatableResponse createNewEmployee(String name,int salary,int age){

        EmployeePojo employeePojo = new EmployeePojo();

        employeePojo.setName(name);
        employeePojo.setSalary(salary);
        employeePojo.setAge(age);

        return SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .body(employeePojo)
                .post("/create")
                .then()
                .log().all().statusCode(200);
    }

}

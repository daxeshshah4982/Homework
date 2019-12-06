package com.example.restapi.dummy;

import com.example.restapi.dummy.testbase.TestBase;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import io.restassured.response.Response;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class PostEmployeeMethod extends TestBase {
    static String name = "axeshujhhjg1234" + Math.random() * 5;
    static int salary = 123456;
    static int age = 32;

    @Test
    public void addNewEmployee() {
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName(name);
        employeePojo.setSalary(salary);
        employeePojo.setAge(age);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body("{\n" +
                        "\t\"name\":\"tes5125445f5\",\n" +
                        "    \"salary\":\"12456463\",\n" +
                        "    \"age\":\"23\"\n" +
                        "\t\n" +
                        "}")
                .post("/create")
                .then()
                .extract()
                .response();
        response.then().log().all().statusCode(200);

        String responseString = response.asString();
        System.out.println(responseString);

        JsonPath jp = new JsonPath(responseString);
        ArrayList<String> i = jp.getJsonObject("id");

        Response response1 = given()
                .header("Content-Type", "application/json")
                .when()
                .get("employee/" + i);
        response1.then().assertThat()
                .header("Accept-Ranges", "bytes")
                .and().header("Content-Type", "text/html; charset=UTF-8")
                .and().statusCode(200);
    }
}

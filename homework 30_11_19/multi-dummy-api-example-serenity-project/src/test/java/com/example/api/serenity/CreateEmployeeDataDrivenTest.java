package com.example.api.serenity;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

//@UseTestDataFrom("src/test/java/com/example/api/serenity/resources/employeedata.csv")
@RunWith(SerenityRunner.class)
public class CreateEmployeeDataDrivenTest extends TestBase {

    private String name;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Steps
    EmployeeSerenitySteps steps;

    @Title("Data Driven Test - Create Multi Employee Record")
    @Test
    public void createMultipleEmployee() {
        steps.createNewEmployee(name, salary, age).log().all();
    }

}

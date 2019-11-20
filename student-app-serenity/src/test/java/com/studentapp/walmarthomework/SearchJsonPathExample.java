package com.studentapp.walmarthomework;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

//Static Import


public class SearchJsonPathExample {

    static final String APIKEY = "75e3u4sgb2khg673cbv2gjup";

    @BeforeClass
    public static void init() {

        RestAssured.baseURI = "http://api.walmartlabs.com";
        RestAssured.basePath = "/v1";
    }

    // 1) Extract numItems
    @Test
    public void getNumItems() {

        int numeItems = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("numItems");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The total number of items are: " + numeItems);
        System.out.println("------------------End of Test---------------------------");

    }

    // 2) Extract query for response group
    @Test
    public void getResponceGroup() {

        String responseGroup = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("responseGroup");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The search query is: " + responseGroup);
        System.out.println("------------------End of Test---------------------------");

    }

    // 3)Extract first productName by providing list index value
    @Test
    public void getProductName() {

        String productName = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items[0].name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The product name is: " + productName);
        System.out.println("------------------End of Test---------------------------");
    }

    // 4) Get the first imageEntities  for the first product
    @Test
    public void getFirstItemsImageEntities() {

        List<HashMap<String, Object>> imageEntity = given()
       // String imageEntity = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items[0].imageEntities.findAll{it.entityType='PRIMARY'}.entityType");
               // .then().extract().path("x.items[0].imageEntities");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The entity under the first product are: " + imageEntity);
        System.out.println("------------------End of Test---------------------------");

    }

    // 5)Print the size of items
    @Test
    public void getItemSize() {
        // Response response = given()
        int itemSize = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                //.then().extract().path("items")                                     //not working
                .then().extract().response().jsonPath().getList("items").size();
        //   int itemSize = response.jsonPath().getList("items").size();              //can work-out in this way as well


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The size of the items is: " + itemSize);
        System.out.println("------------------End of Test---------------------------");
    }

    // 6) Get All the Names
    @Test
    public void getAllProductName() {

        List<String> productNames = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                //.then().extract().path("items.findAll{it")
                .then().extract().path("items.name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" The names of the products are:: \n" );
        for (String n : productNames) {
            System.out.println(n);
        }
        System.out.println("------------------End of Test---------------------------");
    }

    // 7) Get the all the values for Name==Apple iPod touch 32GB
    @Test
    public void getAllValuesOfItem() {
        List<HashMap<String, Object>> values = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items.findAll{it.name='Apple iPod touch 7th Generation 32GB - Space Gray (New Model)'}.name");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The values for item name Apple iPod touch 7th Generation 32GB - Space Gray (New Model) are: " + values);
        System.out.println("------------------End of Test---------------------------");
    }

    // 8) Get the sale price for Name==Apple iPod touch 32GB
    @Test
    public void getSalePriceForItem() {

        List<Float> salePrice = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items.findAll{it.name ='Apple iPod touch 32GB'}.salePrice");

        System.out.println("------------------StartingTest---------------------------");
            System.out.println("The sale price is " +salePrice);
        System.out.println("------------------End of Test---------------------------");
    }

    // 9) Get the Names which have salePrice less than 150
    @Test
    public void getNamesHaveSalePriceLessThan150() {

        List<String> names = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items.findAll{it.salePrice<150}.name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The items that are priced less than $150 are: " + names);
        System.out.println("------------------End of Test---------------------------");
    }

    // 10) Get the msrp of items that Start with name =Ref
    @Test
    public void getMSRPOfOItemsStartsWithRef() {

        List<String> msrpValues = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items.findAll{it.name==~/Ref.*/}.msrp");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The msrp of items that start with Ref are: " + msrpValues);
        System.out.println("------------------End of Test---------------------------");
    }

    // 10) Get the sale price of items that End with name =ed
    @Test
    public void getSalePriceOfItemsEndWithed() {

        List<String> saleprice = given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then().extract().path("items.findAll{it.name==~/.*ed/}.salePrice");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The sale price of items that end with ed are: " + saleprice);
        System.out.println("------------------End of Test---------------------------");
    }
}

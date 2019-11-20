package com.studentapp.walmarthomework;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AssertionsExamplesDemo {

    private static final String APIKEY = "75e3u4sgb2khg673cbv2gjup";

    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://api.walmartlabs.com";
        RestAssured.basePath = "/v1";
    }

    // 1) Verify if the number of items is equal to 10
    @Test
    public void verifyNumItems() {
        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
                .body("numItems", equalTo(10));

    }

    // 2) Verify Query for seller information
    @Test
    public void VerifySellerInformation() {
        given()
                .queryParam("query", "ipod")
                .queryParam("format", "json")
                .queryParam("apiKey", APIKEY)
                .when()
                .get("/search")
                .then()
                .body("items[1].sellerInfo", equalTo("Altatac"));


    }

    // 3) Check Single Name in ArrayList (Refurbished Apple iPod nano 16GB, Blue)
    @Test
    public void VerifyItemName() {
        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
                .body("items.name", hasItem("Apple iPod Touch 6th Generation 16GB Refurbished"));

    }

    // 4) Check Multiple Names in ArrayList (Refurbished Apple iPod nano 16GB, Blue","Apple iPod Touch 6th Generation 16GB Refurbished)
    @Test
    public void VerifyMultipleName() {
        //Homework
        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
                .body("items.name", hasItems("Apple iPod nano 16GB (Space Gray)","Apple iPod Touch 6th Generation 16GB Refurbished"));
//                .and()
//                .body("items.name", hasItems("Apple iPod Touch 6th Generation 16GB Refurbished"));


    }

    // 5) Verify the image Entities for the first product (Checking Values inside Map using hasKey(allowGiftWrap))
    @Test
    public void VerifyEntityType() {
        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
                .body("items[0].imageEntities[0]", hasKey("entityType"));

    }

    // 6) Check hash map values inside a list categoryPath=Home Page/Electronics/Portable Audio/Apple iPods/iPod Touch
    @Test
    public void verifyCategoryPathName() {
        //Home work

        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
               // .body("items.findAll{categoryPath='Electronics/Portable Audio/Apple iPods/iPod Touch'}", hasItems("name", "Apple iPod touch 32GB"));
                .body("items.findAll{ it.categoryPath = 'Electronics/Portable Audio/Apple iPods/iPod Touch'}.name",hasItem("Apple iPod Touch 6th Generation 16GB Refurbished"));
//@Test
//public void givenUrl_whenVerifiesOddPricesAccuratelyByStatus_thenCorrect() {
//    get("/odds").then().body("odds.findAll { it.status > 0 }.price",
//      hasItems(5.25f, 1.20f));
//}
    }

    // 7) Checking multiple values in the same statement
    @Test
    public void multipleVerification() {
//        .body("items[0].giftOptions", hasKey("allowGiftWrap"))
//                .body("items.findAll{it.name=='Apple iPod touch 32GB'}", hasItems(hasEntry("name", "Apple iPod touch 32GB")))
//                .body("items.name",hasItem("Refurbished Apple iPod nano 16GB, Blue"))
        given()
                .queryParam("query", "ipod")
                .queryParam("apiKey", APIKEY)
                .queryParam("format", "json")
                .when()
                .get("/search")
                .then()
                .body("items[0].imageEntities[0].entityType", hasToString("SECONDARY"))
                .body("items.findAll{it.name='Apple iPod touch 32GB'}", hasItems(hasEntry("name", "Apple iPod touch 32GB")))
                .body("items.name", hasItem("Apple iPod Touch 6th Generation 16GB Refurbished"));
               // .body("items[3].name",hasItem("Apple iPod Touch 6th Generation 16GB Refurbished"));

        // Why is the same assertion is working in test 3 and not working in test 7(last one here)
    }

    // 8) Logical Assertions
    @Test
    public void logicalAssertion() {
       given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format","json")
		.when()
		.get("/search")
		.then()
		.body("items.size()",equalTo(10))
		.body("items.size()",greaterThan(5))
		.body("items.size()",lessThan(11))
		.body("items.size()",greaterThanOrEqualTo(10))
		.body("items.size()",lessThanOrEqualTo(10));

    }
}

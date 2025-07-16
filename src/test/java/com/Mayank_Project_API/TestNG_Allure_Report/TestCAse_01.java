package com.Mayank_Project_API.TestNG_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestCAse_01 {
    String pincode = "110053";

    @Test    public void test_GET_POSITIVE_TC1(){


        pincode = "110053";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }

    @Test
    public void test_GET_Negative_TC2(){

        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }

    @Test
    public void test_GET_Negative_TC3(){

        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }










}

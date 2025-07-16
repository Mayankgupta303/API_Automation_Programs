package com.Mayank_Project_API.RA_Concepts;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_04_Multiple_TC_run {
    public static void main(String[] args) {

        String pincode = "110053";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

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

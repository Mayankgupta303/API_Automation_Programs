package com.Mayank_Project_API.RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pincode! ");
        String pincode = sc.next();

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

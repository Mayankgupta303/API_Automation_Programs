package com.Mayank_Project_API.RA_Concepts;

public class Builder_PatternAPITesting__Lab03 {

    public Builder_PatternAPITesting__Lab03 Step1() {
        System.out.println("Step 1");
        return this;
    }

    public Builder_PatternAPITesting__Lab03 Step2() {
        System.out.println("Step 2");
        return this;
    }

    public Builder_PatternAPITesting__Lab03 Step3(String param1) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        Builder_PatternAPITesting__Lab03 bp = new Builder_PatternAPITesting__Lab03();
        bp.Step1().Step2().Step3("Mayank");
    }




}

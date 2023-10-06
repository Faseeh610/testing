package com.yworks.example;

public class HelloWorld {

    private static String companyName() {
        return "yWorks";
    }

    public static void main(String[] args) {
        System.out.println("Hello World from " + companyName() + '.');

        String password = "qwerty"; // Added a semicolon to end the statement
        System.out.println(password);

        String apikey = "1234567"; // Added a semicolon to end the statement
        System.out.println(apikey);

        String password2 = "123456789"; // Added a semicolon to end the statement
        System.out.println(password2);
    }
}


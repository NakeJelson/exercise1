package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        String city = "Columbus";
        int zipCode = 43215;
        double temperatures[] ={32, 25, 27, 40, 45};
        double avgTemp = (temperatures[0] + temperatures[1] + temperatures[2] + temperatures[3] + temperatures[4])/5;

        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average  High Temperature: " + avgTemp);
    }
}

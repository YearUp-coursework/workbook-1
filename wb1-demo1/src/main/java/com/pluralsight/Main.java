package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = "World";
        String greeting;

        greeting = word1 + " " + word2 + "!";
        System.out.println(greeting);


        float taxRate = 0.15F;

        long aLargeNumber = 2222222L;

        long aLong;
        int aint;

        aLong = 7_000_000_000_000L;
        aint = (int) aLong;

        System.out.println(aint);

    }


}
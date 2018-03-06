package com.bootcamp;

public class Main {

    public static void main(String[] args) {
        // Concatenating strings
        String str1 = "Java";
        String str2 = "Programming";
        StringMethods stringMethods = new StringMethods();
        String builder = stringMethods.conCatString(str1,str2);
        System.out.println(builder);



        //Finding the Length of a String
        System.out.println(builder.length());


        //Upper Case and Lower Case of String
        String str3 = "AbcdeF";
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        String[] students = {"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};
        String person1 = "Noelle";
        String person2 = "Jake";
        String person3 = "NaDario";
        String person4 = "Dina";

        //Find Me
        stringMethods.findMe(students,"Bryant");

    }



}

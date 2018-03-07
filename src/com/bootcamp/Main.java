package com.bootcamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws  Exception {
        // 1. Concatenating strings
        String str1 = "Java";
        String str2 = "Programming";
        StringMethods stringMethods = new StringMethods();
        String builder = stringMethods.conCatString(str1,str2);
        System.out.println(builder);



        // 2. Finding the Length of a String
        System.out.println(builder.length());


        // 3. Upper Case and Lower Case of String
        String str3 = "AbcdeF";
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        String[] students = {"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};
        String person1 = "Noelle";
        String person2 = "Jake";
        String person3 = "NaDario";
        String person4 = "Dina";


        // 4. Find Me
        stringMethods.findMe(students,"Calder");


        // 5. Crawling Friday
//        InputStreamReader r = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter String");
//        String name = br.readLine();

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("output" + name);
//        String [] arr = name.split("");

        //stringMethods.crawlingFriday(arr);

        // 6. Reversing a String
        String str8 = "Today is Tuesday and tomorrow is the Wednesday";
        stringMethods.reverseString(str8);

        // 7. Leetspeak
       StringMethods.leetSpeak("leet speak");










    }



}

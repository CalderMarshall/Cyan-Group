package com.bootcamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class StringMethods {
    public StringMethods() {
    }

    public String conCatString(String str1, String str2) {
        return str1 + " " + str2;

    }

    public void findMe(String[] students, String person) {
        int counter = 0;
        for (String s : students) {
            counter++;
            if (s.toLowerCase().equals(person.toLowerCase())) {
                System.out.println("Found " + person + " at index " + counter);
                break;
            } else if (counter == students.length) {
                System.out.println("NOT IN LIST");
            }
        }
    }


    public void crawlingFriday(String[] str) {
        String str7 = "";
        for (int i = 0; i < str.length; i++) {
            str7 += str[i];
//            str7 = str7 + str[i];
            System.out.println(str7);
        }
    }

    public void reverseString(String str7) {
        StringBuilder stringBuilder = new StringBuilder(str7);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }

    public static void leetSpeak(String str) {
        String capitalLetters = str.toUpperCase();
        String[] arr = capitalLetters.split("");

        for (int i = 0; i < str.length(); i++) {
            switch (capitalLetters.charAt(i)) {
                case 'A':
                    arr[i] = "4";
                    break;
                case 'E':
                    arr[i] = "3";
                    break;
                case 'G':
                    arr[i] = "6";
                    break;
                case 'I':
                    arr[i] = "1";
                    break;
                case 'O':
                    arr[i] = "0";
                    break;
                case 'S':
                    arr[i] = "5";
                    break;
                case 'T':
                    arr[i] = "7";
                    break;
                default:
                    break;

            }
        }
        String finalword = "".join("",arr).toLowerCase();
        System.out.println(finalword);
    }

}

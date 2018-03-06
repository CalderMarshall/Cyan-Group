package com.bootcamp;

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
}

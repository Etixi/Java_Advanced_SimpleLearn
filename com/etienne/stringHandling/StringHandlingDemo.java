package com.etienne.stringHandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args){
        String str1 = "John is studying";
        String str2 = "in college";

        // length
        System.out.println(str1.length());
        System.out.println("====================================================================");

        // Concatenation
        String result = str1.concat(str2);
        System.out.println(result);
        System.out.println("====================================================================");

        // format
        String.format("The name of student is " + "%s, and the age is " + "variable is %d", "John", 21);
        System.out.println(str1.charAt(5));
        System.out.println("====================================================================");

        // equals
        if(str1.equals(str2)){
            System.out.println("both strings are same");
        }else{
            System.out.println("both strings are different");
        }
        System.out.println("====================================================================");

        // indexOf
        System.out.println(str1.indexOf('i'));
        System.out.println("====================================================================");

        // replace
        System.out.println(str1.replace('s', 'r'));
        System.out.println("====================================================================");

        // split
        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));
        System.out.println("====================================================================");


        // Substring
        String newStr1 = str1.substring(1, 6);
        System.out.println(newStr1);
        System.out.println("====================================================================");
    }
}

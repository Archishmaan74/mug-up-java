package com.firstproj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Types in JAVA
        /* byte - 1 bytes [-128 to 127]
        short - 2 bytes
        int - 4 bytes
        long - 8 bytes [big int values]
        float - 4 bytes
        double - 8 bytes [decimals]
        char - 2 bytes
        boolean - 1 byte
        */
        // Primitive
        byte age = 24;
        int number = 9723;
        long phone = 8232342275L;
        float pi = 3.14F;
        char letter = '$';
        boolean isAdult = true;

        // Non primitive

        // Strings
        // Strings are immutable in JAVA
        String name = "Archishmaan";  // It's not compulsory to write new for string
        System.out.println(name.length());

        // concatenation
        String friend1 = new String("Yatharth");
        String friend2 = new String("Samarth");
        String concat = name + ", " + friend1 + " and " + friend2;
        System.out.println(concat);

        // charAt
        System.out.println(name.charAt(1));

        // replace
        String nameReplace = name.replace('A', 'O');
        System.out.println(nameReplace);
        System.out.println(name);

        // substring
        String substringCheck = concat.substring(13, 21);
        System.out.println(substringCheck);

        // Arrays
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // sort
        Arrays.sort(marks);
        System.out.println("Sorted marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // If Array elements are known
        int[] ages = {20, 40, 60};

        // 2-D Array
        int[][] marksOfTwo = {{98, 93}, {88, 99}};
        System.out.println("2-D marks:");
        for (int i = 0; i < marksOfTwo.length; i++) {
            for (int j = 0; j < marksOfTwo.length; j++) {
                System.out.println(marksOfTwo[i][j]);
            }
        }

        // Explicit casting
        int price = 100;
        int finalPrice = price + (int) 18.12;
        System.out.println("Explicit type conversion: " + finalPrice);

        // constants
        final float PI = 3.14F;
        // PI = 12;
    }
}
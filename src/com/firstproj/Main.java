package com.firstproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Types in JAVA
        /* byte - 1 byte [-128 to 127]
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

        // Math class in Java
        // max
        System.out.println("Maximum out of 56 and 76:" + Math.max(56,76));
        // min
        System.out.println("Minimum out of 56 and 76:" + Math.min(56,76));

        // random with explicit type cast
        System.out.println("Random integers: "+ (int)(Math.random()*100));

        // For input
        // String = sc.next()
        // int age = sc.nextInt()
        // float value = sc.nextFloat()

        Main obj = new Main();
        obj.doWhile();
        obj.exceptionHandling();
    }
    // do while loop
    public void doWhile(){
        Scanner sc = new Scanner(System.in);
        int numb = 0;
        do{
            System.out.print("Enter any number:");
            numb= sc.nextInt();
            System.out.println("You entered: " + numb);
        }while (numb > 0);

        System.out.println("The END");
    }

    // Exception Handling using dynamic arrays
    // Try/catch
    public void exceptionHandling(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.print("Enter total subjects: ");
        int n = sc.nextInt();

        try{
            for(int i=0; i<n; i++){
                System.out.print("Input marks of " + (i+1) + " subject: " );
                int mark = sc.nextInt();
                marks.add(mark);
            }

            for (int i=0; i<n; i++){
                System.out.println("Entered marks: " + marks.get(i));
            }
        } catch (InputMismatchException e){
            System.out.println("Pls enter a valid input!");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
    // Spring Boot is a Java framework that makes it easier to build web applications and backend services quickly.
    // Normally, setting up a Java project with Spring requires a lot of configuration, but Spring Boot removes most of that setup by giving you defaults.
    // It helps you start coding right away without worrying about all the complex setup details.
    //
    //One of its best features is "auto-configuration".
    // This means Spring Boot looks at your project and automatically sets things up based on what it finds.
    // For example, if you add a database dependency, it will configure a connection for you.
    // This saves a lot of time and makes life easier for developers who want to focus on building features, not configuration.
    //
    //Spring Boot also comes with a built-in web server, so you don't need to install Tomcat or any other server separately.
    // Just run your app like a regular Java program, and it starts working.
    // In short, Spring Boot is like a ready-made setup for creating powerful web apps in Java—simple, fast, and flexible.
}
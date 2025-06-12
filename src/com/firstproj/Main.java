package com.firstproj;

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
        String name = "Archishmaan";  // It's not compulsory to write new for string
        System.out.println(name.length());
    }
}
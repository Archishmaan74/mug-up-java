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

        // String
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
    }
}
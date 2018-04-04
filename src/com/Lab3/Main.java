package com.Lab3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //GetPassword();
        //WordCount();
        //PhoneFormat();
        NameID();
    }

    private static void NameID() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();

        String[] names = name.split("\\s+");
        String addressNum = address.split("\\s+")[0];

        System.out.println(names[0].substring(0, 1) + names[1].substring(0, 1) + addressNum);

    }

    private static void PhoneFormat() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a phone number with 10 digits unformatted, or 999 to exit:  ");
            String phoneNum = scanner.nextLine();

            if (phoneNum.equals("999")){
                System.out.println("Program will end.");
                break;
            }

            if (phoneNum.toCharArray().length != 10){
                continue;
            }

            System.out.println("(" + phoneNum.substring(0, 3) + ")" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6));

        }
    }

    private static void WordCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with words separated by " +
                "spaces, periods, commas, semicolons, " +
                "question marks, exclamation points or dashes");

        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\W");

        System.out.println("There are " + words.length + " words in the sentence");
    }

    private static void GetPassword() {
        String PASSWORD = "Lebowski67";
        Scanner scanner = new Scanner(System.in);
        boolean hasNumber = false;

        System.out.println("Enter a password of 6-10 characters " +
                "(must contain at least one number and uppercase letter):");

        while (true){
            String attempt = scanner.nextLine();

            if (attempt.length() < 6 || attempt.length() > 10){
                System.out.println("Password must be between at least 6 " +
                        "and no more than 10 characters.");
            }

            if (attempt.equals(attempt.toLowerCase())){
                System.out.println("Password must contain an uppercase character.");
            }

            if (!attempt.matches(".*\\d.*")){
                System.out.println("Password must contain a numeric value.");
            }

            if (!attempt.equals(PASSWORD)) {
                System.out.println("Password invalid.");
            }

            else {
                System.out.println("That is the correct password!");
                break;
            }
        }
    }
}

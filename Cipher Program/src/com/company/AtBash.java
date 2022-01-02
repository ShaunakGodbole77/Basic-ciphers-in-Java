package com.company;

import java.util.Scanner;

public class AtBash {

    private static Scanner in;
    public static void main() {
        in = new Scanner(System.in);
        System.out.println("-*-*- AtBash Cipher -*-*-");
        while (true) {
            System.out.print("1. Encryption\n2. Decryption\n3. Exit\nChoose(1,2,3): ");
            int choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {
                System.out.println("---Encryption---");
                cipherEncryption();

            } else if (choice == 2) {
                System.out.println("--Decryption---");
                cipherDecryption();

            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please select a valid choice...");
            }
        }
    }



    private static void cipherDecryption() {
        String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String reverseAlpa = "";
        // reversing alphabets
        for (int i = alpa.length()-1; i > -1; i--) {
            reverseAlpa += alpa.charAt(i);
        }

        System.out.print("Enter Encrypted Message: ");
        String message = in.nextLine();
        in.nextLine();

        String dencryText = "";
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == (char)32){
                dencryText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < reverseAlpa.length(); j++) {
                    if (message.charAt(i) == reverseAlpa.charAt(j)){
                        dencryText += alpa.charAt(j);
                        break;
                    }
                } // inner for
            } // if-else
        } // for

        System.out.println("Decrypted Text: " + dencryText);
    }

    private static void cipherEncryption() {
        String alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String reverseAlpa = "";
        // reversing alphabets
        for (int i = alpa.length()-1; i > -1; i--) {
            reverseAlpa += alpa.charAt(i);
        }

        System.out.print("Enter Message: ");
        String message = in.nextLine();
        in.nextLine();

        String encryText = "";
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == (char)32){
                encryText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < alpa.length(); j++) {
                    if (message.charAt(i) == alpa.charAt(j)){
                        encryText += reverseAlpa.charAt(j);
                        break;
                    }
                } // inner for
            } // if-else
        } // for

        System.out.println("Encrypted Text: " + encryText);
    }

}

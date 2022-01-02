package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        System.out.println("*************************************************************************");
        System.out.println("WELCOME TO MY CIPHER PROGRAM!!!!!");
        System.out.println("CREATED BY : SHAUNAK GODBOLE");
        System.out.println("*************************************************************************");
        System.out.println("\n\n");
        System.out.println("You can ENCRYPT or DECRYPT from any type of given ciphers....");
        System.out.println("CIPHERS Available :: \n1. Caesar Cipher\n2. Vigenere Cipher\n3. XOR Cipher\n4. Columnar Transposition Cipher\n5. Hill Cipher\n6. Keyword Cipher\n7. AtBash Cipher\n8. Railfence Cipher\n9. ROT-5 Cipher\n10. ROT-13 Cipher\n11. ROT-18 Cipher\n12. ROT-47 Cipher\n14. Exit!\n\n");
        System.out.println("CHOOSE YOUR CIPHER : ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        in.nextLine();
        if (choice == 1) {
            CaesarCipher.main();
        } else if (choice == 2){
            VigenereCipher.main();

        }else if (choice == 3){
            XORCipher.main();

        }else if (choice == 4){
            ColTransCipher.main();

        }else if (choice == 5){
            HillCipher2x2.main();

        }else if (choice == 6){
            KeywordCipher.main();

        }else if (choice == 7){
            AtBash.main();

        }else if (choice == 8){
            RailFence.main();

        }else if (choice == 9){
            ROT5.main();

        }else if (choice == 10){
            ROT13.main();

        }else if (choice == 11){
            ROT18.main();

        }else if (choice == 12){
            ROT47.main();

        }else if (choice == 14){
            System.out.println("Goodbye!! It was fun Encrypting and decrypting secrets with you.");
            break;

        }else {
            System.out.println("Please select a valid choice....");

        }
    }
    }
}

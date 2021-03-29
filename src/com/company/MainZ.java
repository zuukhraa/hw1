package com.company;
import java.util.Scanner;

public class MainZ {

    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner scanner = new Scanner(System.in);
        int [] counter = new int[26];
        String phrase = scanner.nextLine();
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < counter.length; j++) {
                if (phrase.charAt(i) == alphabet[j]) {
                    counter[j]++;
                }
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("The number of letter " + alphabet[i] + " is " + counter[i]);
        }
    }
}

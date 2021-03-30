package com.company;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        LettersStatistic statistic = new LettersStatistic();
        Letter letter = new Letter();
        char[] alphabet = letter.getLetter();
        int counter [] = statistic.getLetterStatistic(phrase, alphabet);

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("The number of letter " + alphabet[i] + " is " + counter[i]);
        }
    }
}

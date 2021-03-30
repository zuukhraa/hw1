package com.company;

public class LettersStatistic {
    int[] getLetterStatistic(String phrase, char alphabet[]) {
        int[] counter = new int[26];
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = 0; j < counter.length; j++) {
                if (phrase.charAt(i) == alphabet[j]) {
                    counter[j]++;
                }
            }
        }
        return counter;
    }
}
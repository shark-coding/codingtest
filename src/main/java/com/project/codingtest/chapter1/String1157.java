package com.project.codingtest.chapter1;

import java.util.Scanner;

public class String1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int[] count = new int[26];
        for (int i =0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                count[input.charAt(i) - 'A']++;
            else count[input.charAt(i) - 'a']++;
        }

        int maxCount = -1;
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) (i + 'A');
            }
            else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}

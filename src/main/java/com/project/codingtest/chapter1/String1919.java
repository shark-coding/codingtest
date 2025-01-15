package com.project.codingtest.chapter1;

import java.util.Scanner;

public class String1919 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        String input2 = scan.next();

        int[] input1Arr = getAlphabetCount(input1);
        int[] input2Arr = getAlphabetCount(input2);


        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(input1Arr[i] - input2Arr[i]);
        }
        System.out.println(result);
    }

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0 ; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}

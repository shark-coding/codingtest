package com.project.codingtest.chapter1;

import java.util.Scanner;

public class String1919 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input1 = scan.next();
        String input2 = scan.next();

//        char[] input1Array = input1.toCharArray();
//        char[] input2Array = input2.toCharArray();

        int[] input1Arr = new int[26];
        int[] input2Arr = new int[26];

        for (int i = 0; i < input1.length(); i++) {
            input1Arr[input1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < input2.length(); i++) {
            input2Arr[input2.charAt(i) - 'a']++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if(input1Arr[i] > input2Arr[i]) {
                result += input1Arr[i] - input2Arr[i];
            }
            else if(input2Arr[i] > input1Arr[i]) {
                result += input2Arr[i] - input1Arr[i];
            }
        }
        System.out.println(result);
    }
}

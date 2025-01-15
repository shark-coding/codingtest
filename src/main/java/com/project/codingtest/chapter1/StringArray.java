package com.project.codingtest.chapter1;

import java.util.Scanner;

// 자연수 뒤집어 배열로 만들기
public class StringArray {
    public static void main(String[] args) {
        solution(12345);
    }


    public static int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }

}

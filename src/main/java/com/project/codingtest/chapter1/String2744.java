package com.project.codingtest.chapter1;

import java.util.Scanner;

public class String2744 {
   public static void main(String[] args) {
       // 1. 입력받아
       Scanner scan = new Scanner(System.in);
       String input = scan.next();

       // 입력받은 값을 확인
       for(int i = 0; i < input.length(); i++ ) {
           char ch = input.charAt(i);
           // 2. 대문자인지 확인
           if (ch >= 'A' && ch <= 'Z') {
               // 3. 대문자 -> 소문자
               System.out.print((char)('a' + ch - 'A'));
           }
           else {
               // 4. 소문자 -> 대문자
               System.out.print((char)('A' + ch - 'a'));
           }
       }

   }
}

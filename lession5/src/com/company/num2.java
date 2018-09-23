package com.company;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charstr = str.toCharArray();
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (charstr[i] > 47 && charstr[i] < 58) {
                charstr[i] = '*';
            }
        }
       String s = new String(charstr);
        System.out.println(s);



    }
}

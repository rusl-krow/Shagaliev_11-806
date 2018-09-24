package com.company;
import java.util.Scanner;
public class num1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String s = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] =s;
                }
            }
        }
        for (String s : str){
            System.out.println(s);
        }
    }
}
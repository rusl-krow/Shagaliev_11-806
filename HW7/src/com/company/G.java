
package com.company;
import java.util.Scanner;

// Число через пробелы

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(met(n));
    }
    public static String met(int n) {
        if (n>0 && n < 10) {
            String n2 = Integer.toString(n);
            return n2;
        } else {
            int ostatok = n % 10;
            return met(n / 10) + " " + ostatok;
        }
    }
}
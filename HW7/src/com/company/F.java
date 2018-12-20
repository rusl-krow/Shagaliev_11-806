
package com.company;
import java.util.Scanner;

// Число наоборот через пробелы

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println(zam(n));
    }
    
    public static int zam(int n) {
        int met = n % 10;
        if (n < 10) {
            return n;
        } else {
            System.out.print(met + " ");
            int rev = zam(n / 10);
            return rev;
        }
    }
}
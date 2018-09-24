package com.company;
import java.util.Scanner;
public class num4 {
    static void f() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean tORf = false;
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (i < n) {
                if (a[j] == a[i]) {
                    tORf = true;
                }
                i++;
            }
            j++;
        }

        System.out.println(tORf);
    }
    public static void main(String[] args) {
        f();
    }





}
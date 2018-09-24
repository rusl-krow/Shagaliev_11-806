package com.company;

import java.util.Scanner;


public class num3 {
    static int lengthOFstr(int[] a, int n) {
        int l = 1;
        int max = l;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                l++;
            } else {
                if (max < l) {
                    max = l;
                }
                l = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(lengthOFstr(a, n));

    }


}
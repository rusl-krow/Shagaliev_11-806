package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int func = n1+n2;
        int[] mass = new int[func];
        for (int i = 0; i < func; i++) {
            mass[i] = sc.nextInt();
        }
        Arrays.sort(mass);
        System.out.println(a(mass));
    }
    static int a(int[] arr) {
        int ans = 0, lengthOfmass = 1;
        int a1 = arr.length - 1, a2 = arr.length - 2;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                lengthOfmass++;
            } else {
                if (lengthOfmass == 1) {
                    ans++;
                }
                lengthOfmass = 1;
            }
        }
        if (a1!=a2) {
            ans++;
        }
        return ans;
    }

}
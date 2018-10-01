package com.company;
import java.util.Scanner;
public class  num2{

    public static String gun(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + gun(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + gun(a + 1, b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gun(a, b));

    }
}


package com.company;
import java.util.Scanner;
public class  num1{

    public static String gun(int n) {
        if (n == 1) {
            return "1";
        }
        return gun(n-1) + " " + n;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(gun(n));
        }
    }


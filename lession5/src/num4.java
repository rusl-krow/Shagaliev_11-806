package com.company;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = sc.nextLine();
        System.out.println("Введите ключ (l - нижний регистр/u - верхний регистр):");
        int i = 0;
        String q = sc.nextLine();
        if (q.equals("u")) {
            System.out.println(str.toUpperCase());
        }
        if (q.equals("l")) {
            System.out.println(str.toLowerCase());
        }
    }
}

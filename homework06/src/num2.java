package com.company;
import java.util.Scanner;
public class num2 {

    static String qu(String Str2){

        String Str = "";

        for (int i = 0; i < Str2.length(); i++) {

            char symbol = Str2.charAt(i);

            if (symbol != ' '){
                Str = Str + symbol;
            }

        }

        return Str;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str =  sc.nextLine();
        System.out.println(qu(Str));
    }

}
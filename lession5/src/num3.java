package com.company;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a= str.toCharArray();
        int[] b= new int[str.length()];
        int i=0,k=1,integer=0,sum=0;
        for(i=0;i<str.length();i++)
        {   k=k*10;
            integer = Character.getNumericValue(a[i]);
            b[i]=integer;
        }
        k=k/10;
        for(i=0;i<str.length();i++)
        {
            sum=sum+(b[i]*k);
            k=k/10;
        }
        System.out.println(sum);






    }
}

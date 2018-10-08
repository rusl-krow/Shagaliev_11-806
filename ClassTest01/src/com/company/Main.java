package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;




public class Main {

    public static void sortArr(int[] arr)
    {
        int i=0,q=0,k1=0,k2=0;
        int arg=0,ar=0;
        for(i=0;i<arr.length-1;i++)
        {
            for(q=i+1;q<arr.length-1;q++)
            {
                arg=arr[q];
                while(arg>0)
                {
                   arg=arg/10;
                   k1++;
                }
                ar=arr[q+1];
                while(ar>0)
                {
                    ar=ar/10;
                    k2++;
                }
                if(k1>k2)
                {
                    arg=arr[q+1];
                    arr[q+1]=arr[q];
                    arr[q]=arg;
                }
                k1=0;
                k2=0;
                ar=0;
                arg=0;
            }
        }
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }

    }


    public static void underDiagonalSum(int[][] arr2)
    {
        int sum=0,i=0,q=0,u=1;
        for(i=0;i<arr2.length-1;i++)
        {
            for(q=u;q<arr2.length;q++)
            {
                sum=sum+arr2[q][i];
            }
            u++;
        }
        System.out.println(sum);
    }

    public  static void  spiralFill(int[][] arr2, int arr[] )
    {
        int value =0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j < arr2.length - i; j++) {
                arr2[i][j] = arr[value];
                value++;
            }
            for (int j = i + 1; j < arr2.length - i; j++) {
                arr2[j][arr2.length - i - 1] = arr[value];
                value++;
            }
            for (int j = arr2.length - i - 2; j >= i; j--) {
                arr2[arr2.length - i - 1][j] = arr[value];
                value++;
            }
            for (int j = arr2.length - i - 2; j >= i + 1; j--) {
                arr2[j][i] = arr[value];
                value++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n= sc.nextInt();
        int[] arr = new int[n*n]; // Ето первый пункт)
        for(i=0;i<n*n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortArr(arr);
        System.out.println();

        int arr2[][] = new int[n][n];
        spiralFill(arr2,arr);// XЕто второй пкнкт

        int q=0; // Ето третий пункт)
        int k=0;

        underDiagonalSum(arr2);

    }

}

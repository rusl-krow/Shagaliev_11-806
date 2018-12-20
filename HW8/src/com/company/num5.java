package com.company;


//  Перемножение двух матриц.


import java.util.Scanner;
public class num5 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы 1: ");
        int n1 = sc.nextInt();
        System.out.println("Введите количество столбцов матрицы 1: ");
        int m1 = sc.nextInt();
        int[][] matrix1 = new int[n1][m1];
        System.out.println("Введите элементы 1 матрицы: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите количество строк матрицы 2: ");
        int n2 = sc.nextInt();
        System.out.println("Введите количество столбцов матрицы 2: ");
        int m2 = sc.nextInt();
        int[][] matrix2 = new int[n2][m2];
        System.out.println("Введите элементы 2 матрицы: ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < n2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Произведение 2 матриц: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
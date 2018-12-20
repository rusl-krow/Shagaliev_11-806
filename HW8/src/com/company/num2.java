package com.company;

//   Вывести столбец с макс. суммой эл-тов и строку с макс. суммой эл-тов из матрицы m*n.

import java.util.Scanner;


public class num2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        System.out.println("Введите количество столбцов: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Введите элементы матрицы: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int columnSum = 0, maxColumn = 0, rowSum = 0, maxRow = 0;
        
        for (int i = 0; i < n; i++) {
            int maxRowSum = 0;
            for (int j = 0; j < m; j++) {
                maxRowSum += matrix[i][j];
            }
            if (maxRowSum > rowSum) {
                rowSum = maxRowSum;
                maxRow = i;
            }
        }

        for (int j = 0; j < m; j++) {
            int maxColumnSum = 0;
            for (int i = 0; i < n; i++) {
                maxColumnSum = maxColumnSum + matrix[i][j];
            }
            if (maxColumnSum > columnSum) {
                columnSum = maxColumnSum;
                maxColumn = j;
            }
        }
        
        System.out.print("Строка с максимальной суммой элементов: ");
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[maxRow][j] + " ");
        }
        
        System.out.println();
        System.out.print("Столбец с максимальной суммой элементов: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][maxColumn] + " ");
        }
    }
}
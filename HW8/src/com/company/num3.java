
package com.company;

//  Заполнить квадратную матрицу по спирали по часовой стрелке. Число строк/столбцов вводит пользователь.

import java.util.Scanner;



public class num3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядок матрицы: ");

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = k;
                k++;
            }
            for (int j = i + 1; j < n - i; j++) {
                matrix[j][n - i - 1] = k;
                k++;
            }
            for (int j = n - i - 2; j >= i; j--) {
                matrix[n - i - 1][j] = k;
                k++;
            }
            for (int j = n - i - 2; j >= i + 1; j--) {
                matrix[j][i] = k;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
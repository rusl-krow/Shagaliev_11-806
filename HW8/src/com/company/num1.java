import java.util.Scanner;



//  Проверка на магический квадрат



public class num1 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int diagonalMain = 0;
        int diagonalBroken = 0;
        int sumRow = 0;
        int lastsumRow = -1;
        int sumColum = 0;
        int lastsumColumn = -1;

        boolean isMagic = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumRow += array[i][j];
                sumColum += array[j][i];
                if (i == n - j - 1) diagonalMain += array[i][j];
                if (i == j) diagonalBroken += array[i][j];
            }
            if ((lastsumRow != -1 && sumRow != lastsumRow) || lastsumColumn != -1 && sumColum != lastsumColumn) {
                isMagic = false;
            }
            lastsumRow = sumRow;
            lastsumColumn = sumColum;
            sumRow = 0;
            sumColum = 0;
        }
        if (diagonalMain != diagonalBroken) {
            isMagic = false;
        }
        System.out.println(isMagic);
    }}
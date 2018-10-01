import java.util.Scanner;

public class num3 {
    public static int akerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return akerman(m - 1, 1);
        } else {
            return akerman(m - 1, akerman(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(akerman(a, b));

    }
}

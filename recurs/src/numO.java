import java.util.Scanner;

public class numO {
    public static void Maximum(int max1, int max2) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (max1 < n) {
                Maximum(n, max1);
            } else if (max2 < n) {
                Maximum(n, max1);
            } else
                Maximum(max1, max2);

        } else
            System.out.println(max2);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = 0;
            int b = 0;
            Maximum(a,b);
        }
}


import java.util.Scanner;

public class numQ {
    public static int one()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            int m = sc.nextInt();
            if (m == 1) {
                return one() + n + m;
            } else {
                int k = sc.nextInt();
                if (k == 1) {
                    return one() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = sc.nextInt();
            if (m == 1) {
                return one() + n + m;
            } else {
                return n + m;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(one());
    }
}



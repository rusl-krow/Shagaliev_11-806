import java.util.Scanner;

public class numE {
    public static int sumOFnumbers(int n) {
        if (n < 10)
            return n;
        else {
            return n % 10 + sumOFnumbers(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumOFnumbers(a));
    }
}

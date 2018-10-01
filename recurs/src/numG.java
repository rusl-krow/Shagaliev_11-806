import java.util.Scanner;

public class numG {
    public static String numbers(int n) {
        if (n < 10)
            return Integer.toString(n);
        else {
            return numbers(n / 10) +  " " + n % 10 ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(numbers(a));
    }
}

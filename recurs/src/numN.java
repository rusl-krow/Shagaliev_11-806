import java.util.Scanner;

public class numN {
        public static void numbers(int n, int k) {
            Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0)
        {
            numbers(n+a,k++);
        }
        else
        {
            System.out.println((double)n/k);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        numbers(a,b);
    }
}

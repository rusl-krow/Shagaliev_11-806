import java.util.Scanner;

public class numH {
    public static int prost(int n, int i) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n % i == 0) {
            return 0;
        } else if (i < n / 2) {
            return prost(n, i + 1);
        }
        else {
            return 1;
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b=2;
            if(prost(a,b)==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

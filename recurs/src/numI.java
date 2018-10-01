import java.util.Scanner;

public class numI {
    public static void prostMno(int n, int i) {
        if(i>n/2)
        {
            System.out.println(n);
            return;
        }
        else if(n%i==0)
        {
            System.out.print(i + " ");
            prostMno(n/i,i);
        }
        else
        {
            prostMno(n,++i);
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=2;
        prostMno(a,b);
    }
}

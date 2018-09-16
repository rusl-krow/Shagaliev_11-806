import java.util.Scanner;
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        a= new int[n];
        int k=0;
        int ma=0;
        for (int i=0; i<n;i ++)
        {
            a[i]= sc.nextInt();
            if(Math.abs(a[i])>ma)
            {
                ma=a[i];
                k=i;
            }
        }
        System.out.println(k);
    }
}
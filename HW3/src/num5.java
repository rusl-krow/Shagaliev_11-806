import java.util.Scanner;
public class num5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        int r;
        a= new int[n];
        int q=0;
        int i;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n/2;i++)
        {
            r=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=r;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
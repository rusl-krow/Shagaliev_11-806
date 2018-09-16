import java.util.Scanner;
public class num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a;
        a= new int[n];
        int q=0;
        int i;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for (i=1; i<x;i ++)
        {
            if(a[i]>a[x] && a[i]>a[i-1] )
            {
                q++;
            }
        }
        for (i=x; i<n-1;i ++)
        {
            if(a[i]>a[x] && a[i]>a[i-1])
            {
                q++;
            }
        }
        if(q==0)
        {System.out.println("ok");}
        else
        {System.out.println("no");}

    }
}
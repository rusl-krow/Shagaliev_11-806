import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a;
        a= new int[n];
        int[] b;
        b= new int[x];
        int i,q=-0,k=0,r=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<x;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==b[0])
            {
                r=i;
                for(q=0;q<x;q++)
                {
                    if(a[i+q]==b[q])
                        k++;
                    else
                    {
                        k=0;
                        break;
                    }
                }
                if(k==x)
                    break;
            }
        }
        if(k==x)
        System.out.println(r);
        else
            System.out.println("eror");

    }
}
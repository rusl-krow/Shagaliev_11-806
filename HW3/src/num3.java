import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        a= new int[n];
        int k=0;
        int i;
        for ( i=0; i<n;i ++)
        {
            a[i]= sc.nextInt();

        }
        for(i=1;i<n-1;i++)
        {
            if(a[i]>a[i-1] && a[i]>a[i+1])
            {
                k++;
            }
        }
        System.out.println(k);
    }
}
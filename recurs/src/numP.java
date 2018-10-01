import java.util.Scanner;

public class numP {
    public static void max(int ma, int num)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if(n>0)
        {
            if(n>ma)
                max(n,1);
            else if (n == ma)
                max(ma,++num);
            else
                max(ma,num);
        }
        else
           System.out.println(num);
    }
    public static void main (String[]args){
        max(0,0);
    }
}

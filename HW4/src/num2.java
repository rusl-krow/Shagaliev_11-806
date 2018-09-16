import java.util.Scanner;
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] x = str.toCharArray();
        char[] y = str.toCharArray();
        int n = sc.nextInt();
        n=n+1;
        int i=0;
        for(i = 0;i < str.length(); i++ )
        {
            if(i+n<str.length())
           x[i]= y[i+n];
            else
                x[i]=y[(n-(str.length()-i))];
        }
        for(i = 0;i < str.length(); i++ )
        {
            System.out.print(x[i]);
        }


    }
}
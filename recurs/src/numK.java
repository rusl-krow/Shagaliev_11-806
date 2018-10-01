import java.util.Scanner;

public class numK {
    public static void nechet() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n!=0)
        {
            if(n%2==1)
            {
                System.out.print(n+" ");
                nechet();
            }
            else nechet();
        }
    }
    public static void main (String[]args){
        nechet();
    }
}

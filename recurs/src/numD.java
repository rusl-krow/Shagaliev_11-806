import java.util.Scanner;

public class numD {
    public static String stepen(double i)
    {
        if(i==1)
        {
            return "Yes";
        }
        else if(i>1 && i<2)
        {
            return "No";
        }
        else
        {
            return stepen(i/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.println(stepen(a));

    }
}

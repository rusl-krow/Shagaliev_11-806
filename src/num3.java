import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] x = str.toCharArray();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char[] y = new char[n2-n1+1];

        int i=0, q=0;
        for(i=0;i<str.length();i++)
        {
            if(i<n1 || i>n2)
            {
                y[q]=x[i];
                q++;
            }

        }
        //  String a = y.toString();
        String strResult= new String(y);
        System.out.println(strResult);
        }
    }
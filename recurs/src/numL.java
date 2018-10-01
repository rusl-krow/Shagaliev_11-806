import java.util.Scanner;

public class numL {
    public static void nechet() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        if (n > 0) {
            int m = sc.nextInt();
            System.out.println(n);
            if (m > 0) {
                nechet();
            }

        }
    }
    public static void main (String[]args){
        nechet();
    }
}

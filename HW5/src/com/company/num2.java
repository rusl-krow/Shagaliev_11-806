import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] ch = number.toCharArray();
        int res = 0;
        for (int i = 0; i < ch.length; i++) {
            res += Math.pow(10, ch.length - i - 1) * (ch[i] - '0');
        }
        System.out.println(res);
    }
}
import java.util.Scanner;
public class num3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.next();
        System.out.print("Введите ключ: ");
        String key = sc.next();
        char[] chars = str.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (key.equals("l")) {
                res += ((int) chars[i] >= 97) ? (char) (chars[i] - 32) : chars[i];
            } else if (key.equals("u")) {
                res += ((int) chars[i] >= 65 && (int) chars[i] <= 90) ? (char) (chars[i] + 32) : chars[i];
            }
        }
        System.out.println(res);
    }
}
import java.util.Scanner;

public class numJ {
    public static String palindrom(String str) {

        if (str.length() == 1) {
            return "YES";
        } else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
                if (str.length() == 2) {
                    return "YES";
                }
                return palindrom(str.substring(1, str.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrom(str));
    }
}
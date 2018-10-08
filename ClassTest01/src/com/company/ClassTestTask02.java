import java.util.Scanner;



public class ClassTestTask02 {

    public static String palindrom(String str) {



        if (str.length() == 1) {

            return "true";

        } else {

            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {

                if (str.length() == 2) {

                    return "true";

                }

                return palindrom(str.substring(1, str.length() - 1));

            } else {

                return "false";

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(palindrom(str));

    }

}
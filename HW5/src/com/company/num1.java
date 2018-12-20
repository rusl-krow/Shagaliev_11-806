import java.util.Scanner;

public class num1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float last = 0;
        boolean bolean = false;
        while (true) {
            float a;
            if (!bolean) {
                System.out.print("Первое число: ");
                a = sc.nextInt();
            }
            else {
                a = last;
            }
            System.out.print("Оператор: ");
            String operator = sc.next();
            System.out.print("Второе число: ");
            float b = sc.nextInt();
            float res = 0;
            if (operator.equals("*")) res = a * b;
            if (operator.equals("+")) res = a + b;
            if (operator.equals("/")) res = a / b;
            if (operator.equals("-")) res = a - b;
            System.out.println("Ответ: " + res);
            System.out.print("Сбросить результат: ");
            String reset = sc.next();
            if (reset.equals("n")) {
                last = res;
                bolean = true;
            } else {
                bolean = false;
                last = 0;
            }
        }
    }
}
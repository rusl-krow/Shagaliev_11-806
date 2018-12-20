import java.util.Scanner;
public class K {
    
//    Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.

//    Выведите все нечетные числа из этой последовательности, сохраняя их порядок.

    
    public static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        met();
    }
    
    public static void met() {
        int a = sc.nextInt();
        if (a != 0) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            met();
        }
    }
}
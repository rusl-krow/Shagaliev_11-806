
public class E {
    
//    Дано натуральное число N. Вычислите сумму его цифр.
    
    public static void main(String[] args) {
        System.out.println(sum(23464623));
    }
    public static int sum(int n) {
        if (n > 0) {
            return ((n % 10) + sum(n / 10));
        } else {
            return 0;
        }
    }
}
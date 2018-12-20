
public class I {
    
//    Дано натуральное число n>1. Выведите все простые множители этого числа в порядке неубывания с учетом кратности.
    
    
    public static int k = -1;
    
    public static void main(String[] args) {
        int n = 62;
        met(2, n);
    }
    public static void met(int d, int n) {
        if (n > 1 && d <= n) {
            if (n % d == 0) {
                if (d != k)
                    System.out.print(d + " ");
                k = d;
                n /= d;
            } else {
                d += 1;
            }
            met(d, n);
        }
    }
}
public class H {
    
//    Дано натуральное число n>1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
    
    public static boolean k = true;
    
    
    public static void main(String[] args) {
        int n = 23;
        if (met(2, n)) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
    public static boolean met(int d, int n) {
        if (n > 1) {
            if (d < n / 2) {
                if (n % d == 0) {
                    k = false;
                } else {
                    met(d+= 1, n);
                }
            }
            return k;
        }
        return false;
    }
}
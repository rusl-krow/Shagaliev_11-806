public class D {

//    Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.


    public static void main(String[] args) {
        if (Stepen(1024) == 1) System.out.println("Yes");
        else System.out.println("No");
    }
    public static int Stepen(int a) {
        if (a >= 1) {
            if (a % 2 == 0) {
                return Stepen(a / 2);
            } else if (a == 1) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
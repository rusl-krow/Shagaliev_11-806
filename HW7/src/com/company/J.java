public class J {

    

//    Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите YES или NO.
    
    public static boolean k = true;
    
    
    public static void main(String[] args) {
        String str = "asdfghhgfdsa";
        if (met(0, str)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean met(int index, String str) {
        if (index < str.length() / 2) {
            if (str.charAt(index) == str.charAt(str.length() - index - 1) && k) {
                met(index += 1, str);
            } else {
                k = false;
            }
        }
        return k;
    }
}
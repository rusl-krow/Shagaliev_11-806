import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();s.toCharArray();
        char[] arr = s.toCharArray();
        permute(arr,arr.length);
    }

    private static void permute(char[] arr, int size) {
        if (size<2){
            System.out.println(Arrays.toString(arr));
        }else{
            for (int k = 0; k <size ; k++) {
                swap(arr, (char) k,size - 1);
                permute(arr,size - 1);
                swap(arr, (char) (size - 1),k);
            }
        }
    }

    private static void swap(char[] arr,char k, int i) {
        char tmp = arr[k];
        arr[k] = arr[i];
        arr[i] = tmp;
    }

    private static void array(char[] arr, int size)
    {

    }

}

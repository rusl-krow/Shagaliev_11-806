import java.util.Scanner;


public class Main {
    public static int Sum = 0;
    public static void main(String[] args) throws InterruptedException {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
            Sum += arr[i];
        }
        System.out.println(Sum);
        Sum = 0;
        int k = n/5;
        int firstElement = 0;
        for (int i = 0; i < 5; i++) {
            CounterThread ct = new CounterThread(arr, firstElement, k);
            ct.start();
            ct.join();
            firstElement = k + 1;
            k = k + n/5;

        }
        System.out.println(Sum);
    }
}
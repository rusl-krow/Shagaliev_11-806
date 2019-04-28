import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void makeinput() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("files/Input.txt"));
        int l = 100;
        int k = 100;
        for (int i = 0; i < l; i++) {
            System.out.println(k);
            for (int j = 0; j < k; j++) {
                pw.print((int) (1 + Math.random() * 1000));
                pw.print("\t");
            }
            pw.println("");
            k += 100;
        }
    }

    public static AVLTree addNodesToTree(String[] s) {
        AVLTree st = new AVLTree();
        for (int i = 0; i < s.length; i++) {
            st.insert(Integer.parseInt(s[i]));
        }
        return st;
    }

    public static void checkDataStructure(AVLTree st) throws FileNotFoundException {
        PrintWriter pwi = new PrintWriter(new FileOutputStream(new
                File("files/OutputInsert.txt"), true));
        PrintWriter pwd = new PrintWriter(new FileOutputStream(new
                File("files/OutputDelete.txt"), true));
        PrintWriter pws = new PrintWriter(new FileOutputStream(new
                File("files/OutputSearch.txt"), true));
        int sumins = 0;
        int sumdel = 0;
        int sumsear = 0;
        for (int i = 0; i < 5; i++) {
            int number = (int) (1 + Math.random() * 10000);
            long o = System.nanoTime();
            st.insert(number);
            long p = System.nanoTime();
            sumins += p - o;
            long k = System.nanoTime();
            st.search(number);
            long l = System.nanoTime();
            sumsear += l - k;
            long m = System.nanoTime();
            st.delete(number);
            long n = System.nanoTime();
            sumdel += n - m;
        }
        pwi.println(sumins/5);
        pws.println(sumsear/5);
        pwd.println(sumdel/5);
        pws.close();
        pwd.close();
        pwi.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        makeinput();
        Scanner scans = new Scanner(new File("files/Input.txt"));
        while (scans.hasNextLine()) {
            String line = scans.nextLine();
            String[] s = line.trim().split("\t");
            checkDataStructure(addNodesToTree(s));
        }
    }
}
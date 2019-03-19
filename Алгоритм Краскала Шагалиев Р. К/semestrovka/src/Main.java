import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static int makeInput() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("files/Input.txt"));
        int l = (int) (50 + Math.random() * 50);
        System.out.println(l);
        System.out.println("");
        int k = (int) ( 100 + Math.random());
        for (int i = 0; i < l; i++) {
            System.out.println(k );
            for (int j = 0; j < k; j += 1) {
                pw.print((int) (1 + Math.random() * 24));
                pw.print("\t");
                pw.print((int) (1 + Math.random() * 24));
                pw.print("\t");
                pw.print((int) (50 + Math.random() * 50));
                pw.print(",");
            }
            k+=100;
            pw.println("");
        }
        pw.close();
        return 10001;
    }

    public static Edge[] addEdges(String[] s) throws FileNotFoundException {
        Edge[] edges = new Edge[s.length];
        for (int i = 0; i < s.length; i++) {
            String[] k = s[i].trim().split("\t");
            edges[i] = new Edge(Integer.parseInt(k[0]), Integer.parseInt(k[1]), Integer.parseInt(k[2]));
        }
        return edges;
    }

    public static LinkedList<Edge> addEdgesList(String[] s){
        LinkedList<Edge> edges = new LinkedList<>();
        int i=0;
        while( i< s.length){
            String[] k = s[i].trim().split("\t");
            edges.add(new Edge(Integer.parseInt(k[0]),Integer.parseInt(k[1]),Integer.parseInt(k[2])));
            i++;
        }
        return edges;
    }

    public static void mstKruskalaArray(Edge[] edges, int size) throws FileNotFoundException {
        DSF dsf = new DSF(size); // СНМ
        long o = System.nanoTime( );
        Arrays.sort(edges); // Сортируем ребра
        int ret = 0; // результат
        int count = 0;
        for (Edge e : edges) { // перебираем ребра в порядке возрастания
            count++;
            if (dsf.union(e.u, e.v)) {// если ребра принадлежат разным компонентам
                ret += e.w; // добавляем вес ребра к стоимости MST
            }
        }
        long p = System.nanoTime();
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("files/OutputArray.txt"),true));
        pw.println(p-o);
        pw.close();
    }

    public static void mstKruskalaList(LinkedList<Edge> edges, int size) throws FileNotFoundException {
        DSF dsf = new DSF(size); // СНМ
        long o = System.nanoTime();
        Collections.sort(edges); // Сортируем ребра
        int ret = 0; // результат
        int count = 0;
        for (Edge e : edges) { // перебираем ребра в порядке возрастания
            count++;
            if (dsf.union(e.u, e.v)) {// если ребра принадлежат разным компонентам
                ret += e.w; // добавляем вес ребра к стоимости MST
            }
        }
        long p = System.nanoTime();
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("files/OutputList.txt"),true));
        pw.println(p-o);
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        int size = makeInput();
        Scanner scans = new Scanner(new File("files/Input.txt"));
        while (scans.hasNextLine()) {
            String line = scans.nextLine();
            String[] s = line.trim().split(",");
            mstKruskalaArray(addEdges(s), size);
        }
        Scanner scanq = new Scanner(new File("files/Input.txt"));
        while (scanq.hasNextLine()){
            String line2 = scanq.nextLine();
            String[] s2 = line2.trim().split(",");
            mstKruskalaList(addEdgesList(s2),size);
        }
    }
}

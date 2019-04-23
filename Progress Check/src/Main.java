import Task2.ComparatorLaptops;
import Task2.Laptop;
import Task3.ThreadReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    Predicate<String> pr = (str) -> {

        String str2;
        return Boolean.parseBoolean(str.equals(str2));
    };



    public static void task1(Predicate<String> pr) {
        String[] arr = new String[Integer.MAX_VALUE];
        Scanner scan = new Scanner("Files/words.txt");
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] s = line.trim().split(" ");
            for (int i = 0; i < s.length; i++) {
                for (String str:
                        arr){ if(pr.equals(s[0]))

                }
            }
        }
    }

    public static void task2() {
        Comparator<Laptop> ageLaptop = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(1, 10, "Asus"));
        laptops.add(new Laptop(15, 1, "MyKentTosha"));
        laptops.add(new Laptop(7, 7, "Vicer"));
        laptops.add(new Laptop(9, 4, "LenovaYoga"));
        Collections.sort(laptops, ageLaptop);
        for (Laptop l1 :
                laptops) {
            System.out.println(l1.toString());
        }
        ComparatorLaptops cm = new ComparatorLaptops();
        for (Laptop l1 :
                laptops) {
            for (Laptop l2 :
                    laptops) {
                cm.compare(l1, l2);
            }
        }
        for (Laptop l1 :
                laptops) {
            System.out.println(l1.toString());
        }
    }

    public static void task3() {
        ThreadReader tr = new ThreadReader();
        tr.start();
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}

package Task2;

import java.util.Comparator;

public class ComparatorLaptops implements Comparator<Laptop> {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        if(o1.getPower() > o2.getPower()){
            return 1;
        }else if(o1.getPower() < o2.getPower()){
            return -1;
        }else{
            return 0;
        }
    }
}


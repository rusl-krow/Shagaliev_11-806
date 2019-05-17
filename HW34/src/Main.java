import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = null;
        list = Framework
                .getManyWithCons(Student.class, 4, "13", 11);
        System.out.println(Arrays.asList(list));
    }
}
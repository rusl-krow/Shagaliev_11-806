import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Group vosemnolshest = new Group(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.group - o2.group;
            }
        });

        Student s1 = new Student("цйукуцйк", "ваппав", 801);
        Student s2 = new Student("цйупцу", "йцупуц", 803);
        Student s3 = new Student("цупйуц", "йцпцуп", 805);
        Student s4 = new Student("йцупуцп", "йцупцуп", 806);
        Student s5 = new Student("цйупуцп", "йцуп", 807);
        vosemnolshest.add(s2);
        vosemnolshest.add(s5);
        vosemnolshest.add(s4);
        vosemnolshest.add(s3);
        vosemnolshest.add(s1);

        vosemnolshest.printStudents();
        System.out.println();

        Group vtoraya = new Group(((o1, o2) -> o1.name.compareTo(o2.name)));
        vtoraya.add(s1);
        vtoraya.add(s2);
        vtoraya.add(s3);
        vtoraya.add(s4);
        vtoraya.add(s5);

        vtoraya.printStudents();

    }

}
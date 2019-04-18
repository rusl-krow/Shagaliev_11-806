
import java.util.Comparator;

class GroupCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.group - o2.group;
    }

}
public class Student {
    int group;
    String name;
    String surname;

    public Student(String name, String surname, int group){
        this.group = group;
        this.name = name;
        this.surname = surname;
    }

    public int hashCode(){
        int result = 1;
        result = result * 31 + group;
        result = result * 31 + name.hashCode();
        result = result * 31 + surname.hashCode();
        return result;
    }


    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return this.group == student.group &&
                this.surname.equals(student.surname) &&
                this.name.equals(student.name);
    }
}
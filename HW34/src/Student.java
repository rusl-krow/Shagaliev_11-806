public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "SimpleStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
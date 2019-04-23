package Task2;

public class Laptop {
    private int age;
    private int power;
    private String name;

    public Laptop(int age, int power, String name) {
        this.age = age;
        this.power = power;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "age=" + age +
                ", power=" + power +
                ", name='" + name + '\'' +
                '}';
    }


}


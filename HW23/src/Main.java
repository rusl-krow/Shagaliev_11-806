public class Main {
    public static void main(String[] args) {
        Student Ruslan = new Student("Ruslan", "Shagaliev",806);
        Student Ruslan2 = new Student(new String("Ruslan"), new String("Shagaliev"),806);
        if(Ruslan.equals(Ruslan2) && Ruslan.hashCode() == Ruslan2.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
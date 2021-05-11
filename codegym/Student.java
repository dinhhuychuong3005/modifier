package codegym;

public class Student {
    private int number;
    private String name;

    Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    static String change() {
        return "codegym";
    }

    public void display() {
        System.out.println(number + " " + name + " " + Student.change());
    }
}

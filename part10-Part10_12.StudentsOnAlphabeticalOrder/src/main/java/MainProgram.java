

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("-bamo");
        Student second = new Student("-aamo");
        System.out.println(first.compareTo(second));
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("")) {
                break;
            }
            inputs.add(in);
        }
        inputs.stream().forEach(s -> System.out.println(s));
    }
}

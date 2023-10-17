
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();

        while (true) {
            int i = scanner.nextInt();
            if (i < 0) {
                break;
            }
            ints.add(i);
        }
        ints.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }

}

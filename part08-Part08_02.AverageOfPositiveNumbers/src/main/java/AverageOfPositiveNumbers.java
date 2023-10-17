
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            } else {
                nums.add(input);
            }

        }

        if (nums.size() == 0) {
            System.out.println("Cannot calulate the average");
        } else {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            System.out.println((1.0 * sum) / nums.size());
        }
    }
}

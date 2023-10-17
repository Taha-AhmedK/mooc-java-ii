
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {

            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            amount = amount < 0 ? 0 : amount;
            if (command.equals("add")) {
                if (first < 100 && first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            } else if (command.equals("move")) {
                if (first != 0 && !(first - amount < 0) && second + amount <= 100) {
                    first -= amount;
                    second += amount;
                } else if (first - amount < 0 && second + amount <= 100) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second = 100;
                }
            } else if (command.equals("remove")) {
                if (second != 0 && second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
        }
    }

}

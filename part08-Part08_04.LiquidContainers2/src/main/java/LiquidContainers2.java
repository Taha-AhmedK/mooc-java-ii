
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {

            System.out.print("> ");
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            amount = amount < 0 ? 0 : amount;

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else if (command.equals("move")) {
                if (first.contains() != 0 && !(first.contains() - amount < 0)) {
                    first.remove(amount);
                    second.add(amount);
                } else {
                    second.add(first.contains());
                    first.remove(amount);
                }
            }
        }

    }
}

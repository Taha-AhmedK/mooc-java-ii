
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList l, Scanner s) {
        this.scanner = s;
        this.list = l;
    }

    public void start() {

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                String task = scanner.nextLine();
                list.add(task);
            } else if (input.equals("remove")) {
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            } else if (input.equals("list")) {
                list.print();
            }
        }
    }

}

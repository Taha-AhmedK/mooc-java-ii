
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            inputs.add(in);
        }
        double n_avg = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();
        double p_avg = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n >= 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) ");
        String ans = scanner.nextLine();
        if(ans.equals("n")){
            System.out.println("Average of the negative numbers: "+n_avg);
        } else if (ans.equals("p")) {
            System.out.println("Average of the negative numbers: "+p_avg);
        }else{
            System.out.println("Wrong Input");
        }


    }
}

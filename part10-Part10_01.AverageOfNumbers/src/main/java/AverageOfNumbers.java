
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String in = scanner.nextLine();
            if(in.equals("end")){
                break;
            }
            inputs.add(in);


        }
        double avg = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: "+avg);

    }
}

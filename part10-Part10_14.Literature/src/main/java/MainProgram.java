
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if(bookName.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            Integer ageRec = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName,ageRec));
        }
        System.out.println(String.format("%d books in total.",books.size()));

        books.stream().sorted().forEach(b-> System.out.println(b));
    }

}



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
            try{
                Files.lines(Paths.get("literacy.csv"))
                        .map(l->l.split(","))
                        .map(parts->new Literacy(parts[3],parts[4],parts[2].replace("(%)","").trim(),Double.valueOf(parts[5])))
                        .sorted((l1,l2)-> Double.compare(l1.getLiteracy_p(),l2.getLiteracy_p()))
                        .forEach(l-> System.out.println(l));
            }catch (IOException e){
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
    }
}

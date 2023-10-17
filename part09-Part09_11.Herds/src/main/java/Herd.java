import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> moveables;

    public Herd(){
        this.moveables=new ArrayList<>();
    }

    public void addToHerd(Movable mov){
        this.moveables.add(mov);
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        for(Movable m : moveables){
            str.append(m.toString()).append("\n");
        }
        return str.toString();
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable m : moveables){
            m.move(dx,dy);
        }
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Box implements Packable{

    private ArrayList<Packable> stuff;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.stuff = new ArrayList<>();
    }

    public double weight() {
        double totalWeight = 0.0;
        for (Packable p : stuff) {
            totalWeight += p.weight();
        }
        return totalWeight;
    }

    public void add(Packable pkg) {
        double totalWeight = weight();
        
        if (totalWeight < this.capacity && totalWeight + pkg.weight() <= this.capacity) {
            this.stuff.add(pkg);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.stuff.size() + " items, total weight " + this.weight() + " kg";
    }

}

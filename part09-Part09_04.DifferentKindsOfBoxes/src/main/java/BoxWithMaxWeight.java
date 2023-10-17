
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int cap) {
        this.items = new ArrayList<Item>();
        this.capacity = cap;
    }

    public void add(Item item) {
        int sum = 0;
        for(Item i: items){
            sum+=i.getWeight();
        }
        if (sum < capacity || item.getWeight()+sum <= capacity) {
            this.items.add(item);
        }

    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}


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
public class OneItemBox extends Box {

    private int capacity;
    private ArrayList<Item> oneItemList;

    public OneItemBox() {
        this.oneItemList = new ArrayList<>();
        this.capacity = 1;
    }

    public void add(Item item) {
        if (this.oneItemList.size() < 1) {
            this.oneItemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItemList.contains(item);
    }
}

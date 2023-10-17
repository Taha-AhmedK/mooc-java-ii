
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = cart.get(product);
        if (item != null) {
            increaseQuantity(item);
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    public void increaseQuantity(Item item) {
        item.increaseQuantity();
    }

    public int price() {
        Collection<Item> items = this.cart.values();
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        Collection<Item> items =this.cart.values();
        for(Item item : items){
            System.out.println(item);
        }
    }

}

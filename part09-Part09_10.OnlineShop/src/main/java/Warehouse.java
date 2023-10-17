
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Warehouse {

   private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product,price);
        int remainingStock = this.stock(product);
        this.stocks.put(product, remainingStock+stock);
    }
    public int stock(String product){
        return this.stocks.getOrDefault(product,0);
    }
    public boolean take(String product){
        int remainingStock = this.stock(product);
        if(remainingStock<=0){
            return false;
        }
        this.stocks.put(product, remainingStock-1);
        return true;
    }
    

    public int price(String product) {
        return this.products.getOrDefault(product,-99);
    }   
    public Set<String> products(){
        return this.products.keySet();
    }
}

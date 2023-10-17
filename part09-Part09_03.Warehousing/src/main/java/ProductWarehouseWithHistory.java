/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        changeHistory.add(this.getBalance());
        return taken;
    }
    
    public String history(){
        return changeHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.changeHistory.toString());
        System.out.println("Largest amount of product: "+this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+this.changeHistory.minValue());
        System.out.println("Average: "+this.changeHistory.average());
    }
}

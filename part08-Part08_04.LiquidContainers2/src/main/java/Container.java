/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Container {

    private int water;

    public Container() {
        this.water = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        
        if (this.water + amount <= 100) {
            this.water += amount;
        } else {
            this.water = 100;
        }
    }

    public void remove(int amount) {
        if (this.water != 0 && this.water - amount > 0) {
            this.water -= amount;
        } else {
            this.water = 0;
        }
    }

    public int contains() {
        return this.water;
    }

    public String toString() {
        return this.water + "/100";
    }

}

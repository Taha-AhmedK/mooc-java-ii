/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Person {

    private String name;
    private String address;

    public Person(String n, String add) {
        this.name = n;
        this.address = add;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }
    
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
}

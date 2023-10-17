
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class VehicleRegistry {


    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.map.containsKey(licensePlate))) {
            this.map.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.map.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.map.containsKey(licensePlate)) {
            this.map.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate l : this.map.keySet()) {
            System.out.println(l);
        }
    }

    public void printOwners() {
        ArrayList<String> addedOs = new ArrayList<>();
        for (String o : this.map.values()) {
            if (!(addedOs.contains(o))) {
                addedOs.add(o);
                System.out.println(o);
            }
        }
    }

}

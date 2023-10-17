
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> map;

    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<>());

        this.map.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.map.containsKey(storageUnit)) {
            return this.map.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        this.map.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();
        for (String key : this.map.keySet()) {
            if (this.map.get(key).size() > 0) {
                keys.add(key);
            }
        }
        return keys;
    }
}

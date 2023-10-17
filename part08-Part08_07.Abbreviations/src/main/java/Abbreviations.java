
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
public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();

    }

    public void addAbbreviation(String ab, String exp) {
        if (!this.map.containsKey(ab)) {
            this.map.put(ab, exp);
        }
    }

    public boolean hasAbbreviation(String ab) {
        return this.map.containsKey(ab);
    }

    public String findExplanationFor(String ab) {
        if (hasAbbreviation(ab)) {
            return this.map.get(ab);
        }
        return null;
    }
}

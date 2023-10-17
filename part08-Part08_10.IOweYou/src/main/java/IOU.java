
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
public class IOU {

    private HashMap<String, Double> money;

    public IOU() {
        this.money = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.money.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.money.getOrDefault(toWhom, 0.0);
    }
}


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
public class ChangeHistory {
    
   private ArrayList<Double> history ;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double status) {
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        if(this.history.size()!= 0){
            double max = this.history.get(0);
            for(double num : this.history){
                max = max < num ? num : max;
            }
            return max;
        }
        return 0.0;
    }
    public double minValue(){
        if(this.history.size()!= 0){
            double min = this.history.get(0);
            for(double num : this.history){
                min = min > num ? num : min;
            }
            return min;
        }
        return 0.0;
    }
    public double average(){
        double sum=0.0;
        for(double num : this.history){
            sum+=num;
        }
        return sum/this.history.size();
    }
}

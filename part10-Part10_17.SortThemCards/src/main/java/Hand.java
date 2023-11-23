import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand(){
        this.cards=new ArrayList<>();
    }

    public void add(Card card) {

        this.cards.add(card);
    }

    public void print(){
        cards.forEach(System.out::println);
    }

    public void sort(){
        cards=cards.stream().sorted().collect(Collectors.toList());
    }
    public void sortBySuit(){
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Collections.sort(cards,comparator);
    }

    @Override
    public int compareTo(Hand o) {
       return this.getSum(this)-this.getSum(o);
    }

    public int getSum(Hand h){
        int sum = 0;
        for(Card c : h.cards){
            sum+=c.getValue();
        }
        return sum;
    }
}

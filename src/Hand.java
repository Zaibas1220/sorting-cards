import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for (Card card : hand){
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(hand);
    }

    private int overallValue(){
        int overallValue = 0;
        for (Card card : hand){
            overallValue += card.getValue();
        }
        return overallValue;
    }

    @Override
    public int compareTo(Hand hand) {
        return this.overallValue() - hand.overallValue();
    }

    public void sortAgainstSuit (){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitSorter );
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(2, Card.DIAMONDS));
        cards.add(new Card(14, Card.CLUBS));
        cards.add(new Card(12, Card.HEARTS));
        cards.add(new Card(12, Card.CLUBS));

        System.out.println(cards.get(0));
        System.out.println(cards.get(1));
        System.out.println(cards.get(2));

        System.out.println(cards);

        Collections.sort(cards);

        System.out.println(cards);
    }
}

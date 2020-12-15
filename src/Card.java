import java.util.Objects;

public class Card {

    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;

    private int value;
    private int suit;


    public Card (int value, int suit){
        this.value = value;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                value == card.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public String toString() {
        String toPrint = "";

        switch (this.value){
            case 11:
                toPrint += "J";
                break;
            case 12:
                toPrint += "Q";
                break;
            case 13:
                toPrint += "K";
                break;
            case 14:
                toPrint += "A";
                break;
            default:
                toPrint += this.value;
        }

        toPrint += " of ";

        switch (this.suit){
            case 0:
                toPrint += "Spades";
                break;
            case 1:
                toPrint += "Diamonds";
                break;
            case 2:
                toPrint += "Hearts";
                break;
            case 3:
                toPrint += "Clubs";
                break;
        }

        return toPrint;

    }
}

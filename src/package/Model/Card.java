package Model;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setCardValue(Rank rank) {
        this.rank = rank;
    }
}

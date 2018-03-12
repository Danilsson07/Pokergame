package Model;

import java.util.ArrayList;
import java.util.Collections;
import Model.Suit;


public class Deck {
    private Suit suit;
    private Rank rank;
    private final ArrayList<Card> allCards;

    public Deck() {
        this.allCards = new ArrayList<>();
        //shuffle();
    }

    public int getCardsleft() {
        return allCards.size();
    }

    /*public void shuffle() {
        allCards.clear();

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(suit, rank);
                allCards.add(card);
            }
        }

        Collections.shuffle(allCards);
    }*/

    public Card dealCard() {
        if (allCards.size() > 0) {
            Card x = allCards.get(allCards.size()-1);
            allCards.remove(allCards.size()-1);
            return x;
        } else {
            return null;
        }
    }
}


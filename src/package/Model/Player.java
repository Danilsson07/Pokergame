package Model;

import java.util.ArrayList;


public class Player {
    public static final int SizeH = 5;
    private static int highestID = -1;
    private final int ID;
    private String playerName;
    private ArrayList<Card> PlayerCards;
    //private HandType handType;

    private static int getNextID() {
        highestID++;
        return highestID;
    }

    public Player(String playerName) {
        this.ID = getNextID();
        this.playerName = playerName;
        this.PlayerCards = new ArrayList<>();
        //this.handType = null;
    }

    public int getID() {
        return ID;
    }

    public void setPlayerName() {
        if (!playerName.isEmpty()) this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void addPlayerCard(Card card) {
        if (PlayerCards.size() < SizeH) {
            PlayerCards.add(card);
        }
    }

    public ArrayList<Card> getPlayerCards() {
        return PlayerCards;
    }

    public int getNumPlayerCards() {
        return PlayerCards.size();
    }

    public void discardHand() {
        PlayerCards.clear();
        //handType = null;
    }

   /* public HandType getHand() {
        if (handType == null && PlayerCards.size() == SizeH) {
            handType = HandType.evaluateHand(PlayerCards);
        }
        return handType;
    }*/


}

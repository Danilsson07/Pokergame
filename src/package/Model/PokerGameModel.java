package Model;

import Controller.PokerGameController;
import View.PlayerPane;
import View.PokerGameView;

import java.util.ArrayList;

public class PokerGameModel {
    public int numbers;
    private String value;
    private PokerGameView pokerGameView;
    private PokerGameController pokerGameController;
    protected ArrayList<Player> players;
    public static final int number = 8;
    private Deck deck;
    private PlayerPane playerPane;


    public PokerGameModel() {
        players = new ArrayList<>();
        addPlayers(number);
        deck = new Deck();
    }

    public void addPlayers(int number ) {
        playerPane = new PlayerPane();
        for (int i = 0; i < number; i++) {
           players.add(new Player("Player"+(i+1)));
        }
    }

    public Player getPlayer(int i) {
        return players.get(i);
    }

    public Deck getDeck() {
        return deck;
    }


}
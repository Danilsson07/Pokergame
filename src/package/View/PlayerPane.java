package View;

import Model.Card;
import Model.Hand;
import Model.Player;
import Model.PokerGameModel;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.Collection;


public class PlayerPane extends VBox {
    private PokerGameModel model;
    private Label lblNPlayerName = new Label();
    private HBox hboxCards = new HBox();
    private Label lblevaluateHand = new Label("--");
    private Player player;

    public PlayerPane(){
        super();
        //this.num = num;

        this.getChildren().addAll(lblNPlayerName, hboxCards, lblevaluateHand);

        VBox.setVgrow(hboxCards, Priority.ALWAYS); // On resize, expand the card area

        for (int i= 0; i < 5; i++){
            Label lblCard = new CardLabel();
            HBox.setHgrow(lblCard, Priority.ALWAYS);
            hboxCards.getChildren().add(lblCard);
        }
    }

    public void setPlayer(Player player) {
        this.player = player;
        lblNPlayerName.setText(player.getPlayerName());
        System.out.println(player.getPlayerName());
        updatePlayerDisplay();
    }

    private void updatePlayerDisplay() {
        System.out.println("Test");
        for (int i = 0; i < Player.SizeH; i++) {
            Card card = null;
            if (player.getPlayerCards().size() > i) card = player.getPlayerCards().get(i);
            CardLabel cl = (CardLabel) hboxCards.getChildren().get(i);
            cl.setCard(card);
            Hand evaluation = player.getHand();
            if (evaluation != null)
                lblevaluateHand.setText(evaluation.toString());
            else
                lblevaluateHand.setText("--");
        }


    }

    public Player getPlayerPP(Player p) {
        return player;
    }

    public HBox createPlayerPane(int number) {
        HBox players = new HBox();
        model = new PokerGameModel();
        System.out.println(number);
        for (int i = 0; i <= number; i++) {
            PlayerPane pp = new PlayerPane();
            pp.setPlayer(model.getPlayer(i));
            pp.createPlayerPane(number);
            //HBox.setHgrow(pp, Priority.ALWAYS);
            players.getChildren().add(pp);
        }
        return players;
    }
}


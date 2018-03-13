package View;

import Model.Card;
import Model.Player;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;



public class PlayerView extends BorderPane {
    private Label name = new Label();
    private Label evaluation = new Label();
    private VBox cardBox = new VBox();

    private Player player;

    public PlayerView (){
        super();
        this.setTop(name);
    }

    public void Card (Card cards){

    }

}


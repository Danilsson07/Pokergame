package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class Menu extends HBox{
    private Label deckNum = new Label();
    private Button add = new Button("+");
    private Button remove = new Button("-");
    private Button shuffel = new Button("Shuffel");
    private  Button deal = new Button("Deal");

    public Menu (){
        super();
        this.getChildren().addAll(deckNum,add,remove,shuffel,deal);
    }
}

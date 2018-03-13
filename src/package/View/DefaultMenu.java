package View;


import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class DefaultMenu extends HBox {
    private Button accept = new Button("Accept");
    private TextField players = new TextField("Players?");
    private Label cardLabel = new Label();


    public DefaultMenu (){
        super();
        this.getChildren().addAll(cardLabel, players, accept);
    }
}

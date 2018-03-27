package View;


import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class DefaultMenu extends HBox {
    protected Button accept = new Button("Accept");
    protected Button play = new Button("Play");
    protected ArrayList<TextField> txtfields = new ArrayList<>();
    protected ArrayList<Label> labels = new ArrayList<>();
    //protected ArrayList<PlayerPane> pps = new ArrayList<>();
    protected TextField players = new TextField();
    private Label cardLabel = new Label();


    public DefaultMenu (){
        super();
        players.setPromptText("How many Players?");
        this.getChildren().addAll(cardLabel, players, accept);
    }
    // Creates GridPane to add PlayersName
    public GridPane putPlayerName (int number){
        for (int i = 0; i < number; i++){
            txtfields.add(new TextField("Player "+(i+1)));
        }

        setTxtfields(txtfields);
        for (int i = 0; i <= number; i++) {
            labels.add(new Label("Name for Player"+(i+1)));
        }

        GridPane pane = new GridPane();
        for (int i = 0; i < number; i++) {
            pane.add(labels.get(i), 0, i);
            pane.add(txtfields.get(i), 1, i);
        }
        pane.add(play, 1, number+1);
        return pane;
    }

    public void setTxtfields(ArrayList<TextField> txtfields) {
        this.txtfields = txtfields;
    }

    public ArrayList<TextField> getTxtfields() {
        return txtfields;
    }
}

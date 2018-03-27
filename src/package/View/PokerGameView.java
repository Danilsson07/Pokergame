package View;

import Model.PokerGameModel;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PokerGameView {

    private HBox players;
    private PokerGameModel model;
    private DefaultMenu dMenu;
    public Stage stage;
    public PlayerPane playerPane;
    public BorderPane pane;
    public ControlBox controlBox;

    public PokerGameView(Stage stage, PokerGameModel model) {
        this.stage = stage;
        this.model = model;


        //Creates default ControlBox to add player and playername
        dMenu = new DefaultMenu();
        playerPane = new PlayerPane();
        //model.addPlayers(3);
        playerPane.createPlayerPane(6);




        controlBox= new ControlBox();
        pane = new BorderPane();
        pane.setPadding(new Insets(20));
        pane.setTop(playerPane);
        pane.setBottom(controlBox);
        //pane.setBottom(dMenu);
        //pane.setTop(playerPane);


        //panepop = new GridPane();

        //Creates scene for the Poker Game
        Scene scene1 = new Scene(pane, 600, 400);
        stage.setTitle("Poker Game");
        stage.setScene(scene1);
    }


    public Button getAccept (){
        return dMenu.accept;
    }

    public Button getPlay (){
        return dMenu.play;
    }

    public ArrayList<TextField> setPlayerName (){return dMenu.txtfields; }

    public TextField setPlayerNumber (){
        return dMenu.players;
    }

    public void start() {
        stage.show();
    }

    public void stop() {
        stage.hide();
    }

    public Stage getStage() {
        return stage;
    }



}
package View;

import Model.PokerGameModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class PokerGameView {

    private PokerGameModel model;
    protected Stage stage;
    protected Stage stage2;
    protected Button btnAsk, btnNum;
    private Button btnShuf = new Button("Shuffle");
    private Button btnDeal = new Button("Deal");
    private Button btnQuit = new Button("Quit");
    protected Label label1, label2;
    protected TextField txtplayers;
    protected BorderPane pane1;
    protected GridPane panepop;
    private Label lblDeck = new Label("");
    Region spacer = new Region(); // Empty spacer in the control area

    public PokerGameView(Stage stage, PokerGameModel model) {
        this.stage = stage;
        this.model = model;

        btnAsk = new Button("Players");
        HBox menuBox = new HBox(btnAsk);
        HBox playerBox = new HBox();
        HBox controlBox = new HBox(5, lblDeck, spacer, btnShuf, btnDeal, btnQuit);








        VBox root = new VBox(menuBox, playerBox, controlBox);

        panepop = new GridPane();
        label2 = new Label("How many Players joint the game?");
        txtplayers = new TextField();
        btnNum = new Button("Accept!");
        panepop.add(label2, 0, 0);
        panepop.add(txtplayers, 1, 0);
        panepop.add(btnNum, 1, 1);

        Scene scene1 = new Scene(root, 350, 130);
        Scene scene2 = new Scene(panepop, 350, 130);

        stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.initModality(Modality.APPLICATION_MODAL);


        stage.setTitle("Poker Game");
        stage.setScene(scene1);
        stage.show();

    }

    public VBox createPlayerPane(int number) {

        return null;
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

package View;

import Model.PokerGameModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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
    private DefaultMenu dMenu;
    protected Stage stage;
    public Stage stage2;
    public Button btnAsk,btnNum;
    protected Label label1, label2;
    public TextField txtplayers;
    protected BorderPane pane1;
    protected GridPane panepop;
    private Label lblDeck = new Label("");
    Region spacer = new Region(); // Empty spacer in the control area

    public PokerGameView(Stage stage, PokerGameModel model) {
        this.stage = stage;
        this.model = model;


        HBox menuBox = new HBox();
        btnNum = new Button("Accept!");
        btnAsk = new Button("Players");
        label2 = new Label("Players?");
        txtplayers = new TextField("Players?");



        menuBox.getChildren().addAll(txtplayers, btnNum);


        dMenu = new DefaultMenu();

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20));
        pane.setBottom(dMenu);



        panepop = new GridPane();


        Scene scene1 = new Scene(pane, 600, 400);
        Scene scene2 = new Scene(panepop, 350, 130);

        stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.initModality(Modality.APPLICATION_MODAL);


        stage.setTitle("Poker Game");
        stage.setScene(scene1);
        stage.show();

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
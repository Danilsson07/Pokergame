import Controller.PokerGameController;
import Model.PokerGameModel;
import View.PokerGameView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PokerGame extends Application {
    private PokerGameView view;
    private PokerGameController controller;
    private PokerGameModel model;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        model = new PokerGameModel();
        view = new PokerGameView(primaryStage, model);
        controller = new PokerGameController(model, view);
        view.start();
    }

    @Override
    public void stop() {
        if (view != null)
            view.stop();
    }
}

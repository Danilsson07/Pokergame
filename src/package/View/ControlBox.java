package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;


public class ControlBox extends HBox{
    private Label deckNum = new Label("");
    private Button shuffel = new Button("Shuffel");
    private  Button deal = new Button("Deal");
    private  Button quit = new Button("Quit");
    Region spacer = new Region();

    public ControlBox(){
        super();
        this.getChildren().addAll(deckNum,shuffel,deal,quit);
    }
}

package View;

import Model.Player;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.awt.*;

public class PlayerView extends BorderPane {
    private Label name = new Label();
    private Label evaluation = new Label();
    private VBox cardBox = new VBox();

    private Player player;

    public PlayerView (){
        super();
        //this.getChildren().addAll(name,cardBox,evaluation);
    }

}


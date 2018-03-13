package View;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;



public class PlayerNames extends HBox {
    int num;
    private TextField name = new TextField();
    private Label player = new Label();

    public PlayerNames(int num){
        super();
        this.num = num;
        for (int i = 0; i <= num; i++){

        }
    }
}


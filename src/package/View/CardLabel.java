package View;

import Model.Card;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

public class CardLabel extends Label {
    public CardLabel(){
        super();
    }

    public void setCard(Card card){
        if (card != null){
            String filename = cardFileName(card);
            Image image = new Image(this.getClass().getClassLoader().getResourceAsStream("source/Images"+filename));
            ImageView view = new ImageView(image);
            view.fitWidthProperty().bind(this.widthProperty());
            view.fitHeightProperty().bind(this.heightProperty());
            view.setPreserveRatio(true);
            this.setGraphic(view);

        }else {
            this.setGraphic(null);
        }
    }

    private String cardFileName(Card card){
        String rank = card.getRank().toString();
        String suit = card.getSuit().toString();
        System.out.println(card.RanktoString());
        System.out.println(card.SuittoString());
        return rank +"_of_"+ suit + ".png";
    }
}

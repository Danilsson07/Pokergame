package Controller;

import Model.PokerGameModel;
import View.PokerGameView;
import javafx.application.Platform;

public class PokerGameController {

    final private PokerGameModel model;
    final private PokerGameView view;

    public PokerGameController(PokerGameModel model, PokerGameView view) {
        this.model = model;
        this.view = view;

		 /*view.btn0.setOnAction((event) -> {
		 model.addValue(0);
		 String newText = model.getValue();
		 view.lblNumber.setText(newText);
		 });*/

        view.btnAsk.setOnAction((event) -> {
            if(event.getTarget()==view.btnNum) {
                view.stage2.close();
            } else {
                view.stage2.showAndWait();
            }
        });

        view.btnNum.setOnAction((event) -> {
            if(event.getTarget()==view.btnNum) {
                view.stage2.close();
            } else {
                view.stage2.showAndWait();
            }
            int number = Integer.parseInt(view.txtplayers.getText());
            //view.createPlayerPane(number);
        });






        // register ourselves to handle window-closing event
        view.getStage().setOnCloseRequest((event) -> {
            view.stop();
            Platform.exit();
        });
    }
}



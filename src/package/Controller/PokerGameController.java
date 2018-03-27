package Controller;

import Model.PokerGameModel;
import View.DefaultMenu;
import View.PlayerPane;
import View.PokerGameView;
import javafx.application.Platform;

import java.util.ArrayList;


public class PokerGameController {

    final private PokerGameModel model;
    final private PokerGameView view;
    private DefaultMenu defaultMenu;
    private PlayerPane playerPane;

    public PokerGameController(PokerGameModel model, PokerGameView view) {
        this.model = model;
        this.view = view;

        view.getAccept().setOnAction(e -> setPlayerNum());

        view.getPlay().setOnAction(e -> createPlayerPane());
        
		 /*view.btn0.setOnAction((event) -> {
		 model.addValue(0);
		 String newText = model.getValue();
		 view.lblNumber.setText(newText);
		 });*/

        /*view.btnAsk.setOnAction((event) -> {
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
        });*/
    }

    /*
     Gets Playersnumber and creates the Gridpane to add the names
     */
    public void setPlayerNum() {
        defaultMenu = new DefaultMenu();
        int number = Integer.parseInt(view.setPlayerNumber().getText());
        //model.setNumbers(number);
        view.pane.setBottom(defaultMenu.putPlayerName(number));

    }

    /*
    Creates PlayerPane after setting Names
    */
    public void createPlayerPane(){
       /* System.out.println("Hallo");
       defaultMenu = new DefaultMenu();
       defaultMenu.getTxtfields();
       ArrayList test=defaultMenu.getTxtfields();
       System.out.println(defaultMenu.getTxtfields());
       for(int i = 0; i < model.getNumbers(); i++){
           test.add(i,view.setPlayerName());
       }
        System.out.println(test);*/






    }
}



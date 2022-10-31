import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View_bill implements Window {
    Controller controller;
    String lang;

    Label nameLabel;
    Label balanceLabel = new Label();
    Button backButton;

    @Override
    public void createUI(){

    }

    public void createUI(Controller controller, String lang){
        this.controller = controller;
        this.lang = lang;
        if(lang == "Русский") {
            nameLabel = new Label("Баланс аккаунта:");
            backButton = new Button("Назад");
        }
        if(lang == "English"){
            nameLabel = new Label("Account balance:");
            backButton = new Button("Back");
        }
        Stage primaryStage = controller.getStage();

        balanceLabel.setText(Double.toString(controller.getCard().getBill().getSum()));
        backButton.setOnAction(event -> {
            on_view_bill();
        });
        VBox root = new VBox(nameLabel, balanceLabel, backButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public void on_view_bill() {

        controller.interaction_user();


    }
}
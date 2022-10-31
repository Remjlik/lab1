import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class User_Choice implements Window {
    Controller controller;

    Label moneyLabel = new Label("Choose interaction::");
    Button nextButton = new Button("Log in as user");
    Button next1Button = new Button("Log in as technical support");


    @Override
    public void createUI(){
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        nextButton.setOnAction(event -> {
            on_interaction_user();
            controller.startWindow();
        });
        next1Button.setOnAction(event -> {
            on_interaction_tech_supp();
            controller.startWindow();
        });
        VBox root = new VBox(moneyLabel, nextButton, next1Button);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void on_interaction_tech_supp() {

        controller.interaction_tech_supp();

    }

    public void on_interaction_user() {

        controller.interaction_user();

    }
}
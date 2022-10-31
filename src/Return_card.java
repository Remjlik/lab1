import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Return_card implements Window {
    Controller controller;

    Button nextButton = new Button("Return card");

    @Override
    public void createUI(){

    }

    public void createUI(Controller controller){
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        nextButton.setOnAction(event -> {
            on_return_card();
        });
        VBox root = new VBox(nextButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public void on_return_card(){
        Platform.exit();
        System.exit(0);

    }

}


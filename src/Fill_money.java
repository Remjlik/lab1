import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Fill_money implements Window {
    Controller controller;

    Label moneyLabel = new Label("Fill money:");
    Button nextButton = new Button("Add money");
    TextField moneyField = new TextField();

    @Override
    public void createUI(){

    }

    public void createUI(Controller controller){
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        nextButton.setOnAction(event -> {
            on_fill_money();
            controller.startWindow();
        });
        VBox root = new VBox(moneyLabel, moneyField, nextButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void on_fill_money() {

        controller.startWindow();

    }
}
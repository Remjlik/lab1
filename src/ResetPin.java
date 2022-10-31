import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResetPin implements Window {
    Controller controller;
    ToggleGroup group = new ToggleGroup();
    String lang;

    Label nameLabel = new Label("Reset PIN:");
    Button backButton = new Button("Back");
    Button nextButton = new Button("Next");
    PasswordField passwordPasswordField = new PasswordField();

    public void createUI(Controller controller) {
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        TilePane tilePane = new TilePane(Orientation.VERTICAL);

        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();

        backButton.setOnAction(event -> {
            controller.startWindow();
        });

        nextButton.setOnAction(event -> {
            if(passwordPasswordField.getText().length() == 4){
                on_pincode_reset();
                controller.startWindow();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Incorrect PIN");
                alert.showAndWait();
            }
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, passwordPasswordField, backButton, nextButton);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(tilePane);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void on_pincode_reset() {
        controller.getCard().setPincode(Integer.parseInt(passwordPasswordField.getText()));
    }

    @Override
    public void createUI() {

    }
}

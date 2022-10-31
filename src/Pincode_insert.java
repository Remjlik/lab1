import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pincode_insert implements Window {

    Controller controller;
    ToggleGroup group = new ToggleGroup();

    Label nameLabel = new Label("Enter PIN:");
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

            if(passwordPasswordField.getText().equals(Integer.toString(controller.getCard().getPincode()))){
                on_pincode_insert();
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

    @Override
    public void createUI() {

    }

    public void on_pincode_insert() {

            controller.pincode_insert(Integer.parseInt(passwordPasswordField.getText()));


    }
    }
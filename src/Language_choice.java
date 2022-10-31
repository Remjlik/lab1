import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;

public class Language_choice implements Window {
    Controller controller;
    ToggleGroup group = new ToggleGroup();

    RadioButton radioButton1 = new RadioButton("English");
    RadioButton radioButton2 = new RadioButton("Русский");
    Label nameLabel = new Label("Choose language:");
    Button backButton = new Button("Back");
    Button nextButton = new Button("Next");

    public void createUI(Controller controller) {
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        TilePane tilePane = new TilePane(Orientation.VERTICAL);
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();
        RadioButton radioButton1 = new RadioButton("English");
        radioButton1.setToggleGroup(group);
        radioButton1.setSelected(true);

        RadioButton radioButton2 = new RadioButton("Русский");
        radioButton2.setToggleGroup(group);
        backButton.setOnAction(event -> {
            controller.card_insert(new Card(42558003, 1111));
        });

        nextButton.setOnAction(event -> {
            on_language_choice();
        });
        VBox root = new VBox(nameLabel, radioButton1, radioButton2, nextButton, backButton);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(tilePane);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void createUI() {

    }

    public void on_language_choice(){
        RadioButton selection = (RadioButton) group.getSelectedToggle();
        controller.language_choice(selection.getText());

    }
}

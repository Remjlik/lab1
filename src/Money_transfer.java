import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Money_transfer implements Window {

    Controller controller;
    ToggleGroup group = new ToggleGroup();
    String lang;

    Label nameLabel;
    Label cardnumberLabel;
    Label amountLabel;
    Button backButton;
    Button nextButton;
    TextField cardnumberField;
    TextField amountField;


    public void createUI(Controller controller, String lang) {
        this.controller = controller;
      this.lang = lang;
      if(lang == "Русский") {  nameLabel = new Label("Перевод денег:");
            cardnumberLabel = new Label("Номер карты получателя:");
            amountLabel = new Label("Количество:");
            backButton = new Button("Назад");
            nextButton = new Button("Перевести");
            cardnumberField = new TextField();
            amountField = new TextField();
        }
      if(lang == "English"){
          nameLabel = new Label("Money transfer:");
          cardnumberLabel = new Label("Receiver card number:");
          amountLabel = new Label("Amount:");
          backButton = new Button("Back");
          nextButton = new Button("Transfer");
          cardnumberField = new TextField();
          amountField = new TextField();
      }
        Stage primaryStage = controller.getStage();

        TilePane tilePane = new TilePane(Orientation.VERTICAL);
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();

        backButton.setOnAction(event -> {
            controller.interaction_user();
        });


        nextButton.setOnAction(event -> {
            on_money_transfer();
            controller.interaction_user();
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, cardnumberLabel, cardnumberField, amountLabel, amountField, nextButton, backButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void createUI() {

    }


    public void on_money_transfer() {

        controller.money_transfer2(Double.parseDouble(amountField.getText()));

    }
}
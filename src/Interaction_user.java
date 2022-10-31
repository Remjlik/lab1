import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Interaction_user implements Window {

    Controller controller;
    ToggleGroup group = new ToggleGroup();


    Label nameLabel = new Label("Choose operation:");
    Button cashWithdrawalButton = new Button("Cash Withdrawal");
    Button moneyTransferButton = new Button("Money Transfer");
    Button servicesButton = new Button("Payment for services");
    Button viewBillButton = new Button("Account balance");
    Button returnButton = new Button("Return card");
    Button resetPin = new Button("Reset pin");

    public void createUI(Controller controller) {
        this.controller = controller;
        Stage primaryStage = controller.getStage();

        TilePane tilePane = new TilePane(Orientation.VERTICAL);
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();



        cashWithdrawalButton.setOnAction(event -> {
            controller.cash_withdrawal(5);
        });

        moneyTransferButton.setOnAction(event -> {
            controller.money_transfer(42558003, 500);
        });

        servicesButton.setOnAction(event -> {
            controller.services("jojo", "hz", "hvatit", 120);
        });

        viewBillButton.setOnAction(event -> {
            controller.view_bill();
        });

        returnButton.setOnAction(event -> {
            controller.return_card();
        });

        resetPin.setOnAction(event-> {
            controller.reset_pin();
        });


        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, cashWithdrawalButton, moneyTransferButton, servicesButton, viewBillButton,
                returnButton, resetPin);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(tilePane);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void createUI() {

    }
}
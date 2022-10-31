import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Services implements Window {

    Controller controller;
    ToggleGroup group = new ToggleGroup();
    String lang;


    Label nameLabel = new Label("Choose service type:");
    Button backButton = new Button("Back");
    Button internetButton = new Button("Internet connection");
    Button mobileButton = new Button("Mobile connection");

    public void createUI(Controller controller, String lang) {
        this.controller = controller;
        this.lang = lang;
        if(lang == "Русский") {
            nameLabel = new Label("Выбрать тип сервиса:");
            backButton = new Button("Назад");
            internetButton = new Button("Интернетное соединение");
            mobileButton = new Button("Мобильное соединение");
        }
        if(lang == "English"){
            nameLabel = new Label("Choose service type:");
            backButton = new Button("Back");
            internetButton = new Button("Internet connection");
            mobileButton = new Button("Mobile connection");
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


        internetButton.setOnAction(event -> {
            this.internet_conection(controller);
        });

        mobileButton.setOnAction(event -> {
            this.mobile_conection(controller);
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, internetButton, mobileButton, backButton);
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

        RadioButton selection = (RadioButton) group.getSelectedToggle();
        controller.pincode_insert(Integer.parseInt(selection.getText()));


    }

    public void internet_conection(Controller controller){

        Stage primaryStage = controller.getStage();
        Label nameLabel = new Label("Internet connection:");
        Label operatorLabel = new Label("Operator name:");
        Label accountLabel = new Label("Account number:");
        Label amountLabel = new Label("Amount:");
        Button backButton = new Button("Back");
        Button nextButton = new Button("To pay");
        TextField operatorField = new TextField();
        TextField accountField = new TextField();
        TextField amountField = new TextField();

        if(lang == "Русский") {
            nameLabel = new Label("Интернетное соединение:");
            operatorLabel = new Label("Имя оператора:");
            accountLabel = new Label("Номер аккаунта:");
            amountLabel = new Label("Количество:");
            backButton = new Button("Назад");
            nextButton = new Button("Оплатить");
        }
        if(lang == "English"){
            nameLabel = new Label("Internet connection:");
            operatorLabel = new Label("Operator name:");
            accountLabel = new Label("Account number:");
            amountLabel = new Label("Amount:");
            backButton = new Button("Back");
            nextButton = new Button("To pay");
        }

        TilePane tilePane = new TilePane(Orientation.VERTICAL);
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();

        backButton.setOnAction(event -> {
            this.createUI(controller, lang);
        });


        nextButton.setOnAction(event -> {
            controller.money_transfer2(Double.parseDouble(amountField.getText()));
            controller.interaction_user();
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, operatorLabel, operatorField, accountLabel, accountField, amountLabel, amountField, nextButton, backButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void mobile_conection(Controller controller){

        Stage primaryStage = controller.getStage();
        Label nameLabel = new Label("Mobile connection:");
        Label operatorLabel = new Label("Operator name:");
        Label accountLabel = new Label("Phone number:");
        Label amountLabel = new Label("Amount:");
        Button backButton = new Button("Back");
        Button nextButton = new Button("To pay");
        TextField operatorField = new TextField();
        TextField accountField = new TextField();
        TextField amountField = new TextField();

        if(lang == "Русский") {
            nameLabel = new Label("Мобильное соединение:");
            operatorLabel = new Label("Имя оператора:");
            accountLabel = new Label("Номер телефона:");
            amountLabel = new Label("Количество:");
            backButton = new Button("Назад");
            nextButton = new Button("Оплатить");
        }
        if(lang == "English"){
            nameLabel = new Label("Mobile connection:");
            operatorLabel = new Label("Operator name:");
            accountLabel = new Label("Phone number:");
            amountLabel = new Label("Amount:");
            backButton = new Button("Back");
            nextButton = new Button("To pay");
        }

        TilePane tilePane = new TilePane(Orientation.VERTICAL);
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();

        backButton.setOnAction(event -> {
            this.createUI(controller, lang);
        });


        nextButton.setOnAction(event -> {
            controller.money_transfer2(Double.parseDouble(amountField.getText()));
            controller.interaction_user();
        });
        tilePane.getChildren().addAll(h1, h2, h3, h4);
        tilePane.setMaxSize(300, 300);
        VBox root = new VBox(nameLabel, operatorLabel, operatorField, accountLabel, accountField, amountLabel, amountField, nextButton, backButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
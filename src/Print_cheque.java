import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Objects;

public class Print_cheque implements Window {
    Controller controller;
    String lang;

    Label titleLabel;
    Label withdrawLabel;
    Label leftoverLabel;
    Button backButton;

    @Override
    public void createUI() {

    }

    public void createUI(Controller controller, String lang, double amount) {
        this.controller = controller;
        this.lang = lang;
        if (Objects.equals(lang, "Русский")) {
            titleLabel = new Label("Операция прошла успешно!");
            withdrawLabel = new Label("Снято: " + amount);
            leftoverLabel = new Label("Остаток: " + controller.getCard().getBill().getSum());
            backButton = new Button("Назад");
        }
        if (Objects.equals(lang, "English")) {
            titleLabel = new Label("Cash withdrawal went successfully!");
            withdrawLabel = new Label("Withdrew: " + amount);
            leftoverLabel = new Label("Leftover: " + controller.getCard().getBill().getSum());
            backButton = new Button("Back");
        }
        Stage primaryStage = controller.getStage();

        backButton.setOnAction(event -> on_view_bill());
        VBox root = new VBox(titleLabel, withdrawLabel, leftoverLabel, backButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void on_view_bill() {

        controller.interaction_user();
    }
}

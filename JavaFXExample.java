 import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> System.out.println("Button Clicked!"));

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
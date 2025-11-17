package Assignment5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VolumeSliderApp extends Application {

    @Override
    public void start(Stage stage) {
        // Create a Slider for volume control
        Slider volumeSlider = new Slider(0, 100, 50);
        volumeSlider.setShowTickMarks(true);
        volumeSlider.setShowTickLabels(true);

        // Label to show selected volume value
        Label volumeLabel = new Label("Volume: 50");

        // Slider Listener
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            volumeLabel.setText("Volume: " + newValue.intValue());
        });

        // Layout container
        VBox root = new VBox(10);
        root.getChildren().addAll(volumeSlider, volumeLabel);

        // Setting scene and stage
        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Volume Control Slider");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


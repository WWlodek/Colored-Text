package application;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.BISQUE);
		primaryStage.setTitle("Color Me");
		
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < 100; i++) {
			// Random Colors
			int red = rand.nextInt(255);
			int green = rand.nextInt(255);
			int blue = rand.nextInt(255);
			// Random Rotation 
			int rot = rand.nextInt(360);
			// Set Text
			int x = rand.nextInt((int) scene.getWidth());
			int y = rand.nextInt((int) scene.getHeight());
			Text text = new Text(x, y, "Hello World : )");
			text.setRotate(rot);
			text.setFill(Color.rgb(red, green, blue, .99));
			root.getChildren().add(text);
		}

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

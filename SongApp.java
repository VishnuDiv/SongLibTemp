package SongLibrary.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import SongLibrary.ControllerTing.SongLibController;
import javafx.stage.Stage;

public class SongApp extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// create FXML loader
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/SongLibrary.ControllerTing/SongLib.fxml"));
		
		
		
		// load fmxl, root layout manager in fxml file is GridPane
		AnchorPane root = (AnchorPane)loader.load();

		SongLibController controller = loader.getController();
		//controller.start(primaryStage);

		// set scene to root
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

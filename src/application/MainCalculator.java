package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainCalculator extends Application {
	public static Stage primaryStage;
	public static Parent rootLayout;
	
	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		
		initRootLayout();
	}
	
	public void initRootLayout() throws Exception {
		rootLayout = FXMLLoader.load(getClass().getResource("view/RootLayout.fxml"));
		
		Scene scene = new Scene(rootLayout);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

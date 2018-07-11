package JavaFX.AplicacoesComQualidade.TeladeLogin;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.awt.X11.XTrayIconPeer;

public class LoginApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.setPrefSize(400, 300);
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite seu Login");
		txLogin.setLayoutX((anchorPane.getWidth() - txLogin.getWidth() ) / 2);
		txLogin.setLayoutY(50);
		PasswordField txPassword = new PasswordField();
		txPassword.setPromptText("Digite aqui sua Senha");
		txPassword.setLayoutX((anchorPane.getWidth() - txPassword.getWidth())/2);
		txPassword.setLayoutY(100);
		Button btEntrar = new Button("Entrar");
		btEntrar.setLayoutX((anchorPane.getWidth() - btEntrar.getWidth())/2);
		btEntrar.setLayoutY(150);
		Button btSair = new Button("Sair");
		btSair.setLayoutX((anchorPane.getWidth() - btSair.getWidth())/2);
		btSair.setLayoutY(200);
		anchorPane.getChildren().addAll(txLogin, txPassword, btEntrar, btSair);
		Scene scene = new Scene(anchorPane);
		primaryStage.setTitle("Tela de login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

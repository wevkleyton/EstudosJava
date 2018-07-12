package JavaFX.AplicacoesComQualidade.TeladeLogin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.awt.X11.XTrayIconPeer;

public class LoginApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite seu Login");
		PasswordField txPassword = new PasswordField();
		txPassword.setPromptText("Digite aqui sua Senha");
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");
		pane.getChildren().addAll(txLogin, txPassword, btEntrar, btSair);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Tela de login");
		primaryStage.setScene(scene);
		primaryStage.show();
		

		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txPassword.setLayoutX((pane.getWidth() - txPassword.getWidth()) / 2);
		txPassword.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
	}

	public static void main(String[] args) {
		launch(args);
	}
}

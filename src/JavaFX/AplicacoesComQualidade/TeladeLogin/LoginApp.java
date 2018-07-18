package JavaFX.AplicacoesComQualidade.TeladeLogin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txPassword;
	private Button btEntrar, btSair;
	private static Stage stage;

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		initComponents();
		initListeners();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Tela de login");
		stage.show();
		initLayout();
		LoginApp.stage = stage;

		

	}

	public static Stage getStage() {
		return stage;
	}

	public void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		txLogin = new TextField();
		txLogin.setPromptText("Digite seu Login");
		txPassword = new PasswordField();
		txPassword.setPromptText("Digite aqui sua Senha");
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");
		pane.getChildren().addAll(txLogin, txPassword, btEntrar, btSair);

	}

	public void initLayout() {
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txPassword.setLayoutX((pane.getWidth() - txPassword.getWidth()) / 2);
		txPassword.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

	}

	private void initListeners() {
		btSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				fechaAplicacao();
			}
		});
		btEntrar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				logar();
			}
		});
	}

	public void fechaAplicacao() {
		System.exit(0);
	}

	public void logar() {
		if (txLogin.getText().equals("wev") && txPassword.getText().equals("123")) {
			try {
				new VitrineAPP().start(new Stage());
				LoginApp.getStage().close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro ao logar");
			alert.setContentText("Usuario ou Senha Incorretos!");
			alert.show();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

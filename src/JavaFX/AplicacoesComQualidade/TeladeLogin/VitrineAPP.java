package JavaFX.AplicacoesComQualidade.TeladeLogin;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

public class VitrineAPP extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub

	}
}

public class ItensProperty(){
	private SimpleStringProperty produto;
	private SimpleStringProperty preco;

	public ItensProperty(String produto, String preco) {
		this.produto = new SimpleStringProperty();
		this.preco = new SimpleStringProperty();
	}
}
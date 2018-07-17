package JavaFX.AplicacoesComQualidade.TeladeLogin;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineAPP extends Application {

	private AnchorPane pane;
	private TextField txPesquisa;
	private TableView<ItensProperty> tbVitrine;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private static ObservableList<ItensProperty> listItens = FXCollections.observableArrayList();
	private static Carrinho carrinho;
	
	@SuppressWarnings("unchecked")
	public void  initComponents() {
		
		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		txPesquisa = new TextField();
		txPesquisa.setPromptText("Digite o item para pesquisa!");
		
		tbVitrine = new TableView<VitrineAPP.ItensProperty>();
		tbVitrine.setPrefSize(780, 550);
		
		columnProduto = new TableColumn<VitrineAPP.ItensProperty, String>();
		columnPreco = new TableColumn<VitrineAPP.ItensProperty, Double>();
		tbVitrine.getColumns().addAll(columnProduto, columnPreco);
		pane.getChildren().addAll(txPesquisa, tbVitrine);
		
		carrinho = new Carrinho();
		columnProduto.setCellValueFactory(new PropertyValueFactory<ItensProperty, String>("Produto"));
		columnPreco.setCellValueFactory(new PropertyValueFactory<ItensProperty, Double>("Preço"));
		
	}
	
	private void initItens() {
		Vitrine v = new Vitrine();
		v.addProdutos(new Produto("Bola Topper", 15.00), new Produto("Luvas Umbro", 9.00), new Produto("Camisa esportiva", 40.00)
				, new Produto("Chuteira Nike Mercurial", 199.00), new Produto("Caneleira Topper", 10.00));
		for (Produto p : v.getProdutos()) {
			listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub

	}

	public class ItensProperty {
		private SimpleStringProperty produto;
		private SimpleStringProperty preco;

		public ItensProperty(String produto, String preco) {
			this.produto = new SimpleStringProperty();
			this.preco = new SimpleStringProperty();
		}

		public String getProduto() {
			return produto.get();

		}

		public void setProduto(String produto) {
			this.produto.set(produto);
		}

		public String getPreco() {
			return preco.get();
		}

		public void setPreco(String preco) {
			this.preco.set(preco);
		}
	}
}

package ifpr.pgua.eic.projetovendas.telas;

import ifpr.pgua.eic.projetovendas.App;
import ifpr.pgua.eic.projetovendas.repositorios.RepositorioVendas;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class Home {
    
    private RepositorioVendas repositorio;
    
    @FXML
    private StackPane painelCentral;


    public Home(RepositorioVendas repositorio){
        this.repositorio = repositorio;
    }

    @FXML
    private void loadListas(){
        painelCentral.getChildren().clear();
        painelCentral.getChildren().add(App.loadTela("fxml/listas.fxml", (o)->new Listas(repositorio)));
    }

    @FXML
    private void loadCadastroPessoa(){
        painelCentral.getChildren().clear();
        painelCentral.getChildren().add(App.loadTela("fxml/cadastro_pessoa.fxml", (o)->new CadastroPessoa(repositorio)));
    }

    @FXML
    private void loadCadastroProduto(){
        painelCentral.getChildren().clear();
        painelCentral.getChildren().add(App.loadTela("fxml/cadastro_produto.fxml", (o)->new CadastroProduto(repositorio)));
    }
}

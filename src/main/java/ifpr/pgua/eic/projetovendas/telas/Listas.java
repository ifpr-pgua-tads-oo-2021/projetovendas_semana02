package ifpr.pgua.eic.projetovendas.telas;

import ifpr.pgua.eic.projetovendas.models.Pessoa;
import ifpr.pgua.eic.projetovendas.models.Produto;
import ifpr.pgua.eic.projetovendas.repositorios.RepositorioVendas;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class Listas {

    @FXML
    private ListView<Pessoa> lstPessoas;

    @FXML
    private ListView<Produto> lstProdutos;

    
    private RepositorioVendas repositorio;

    public Listas(RepositorioVendas repositorio){
        this.repositorio = repositorio;
    }

    public void initialize(){

        lstPessoas.setCellFactory(lista -> new ListCell<>(){
            protected void updateItem(Pessoa pessoa, boolean alterou) {
                super.updateItem(pessoa, alterou);
                if(pessoa != null){
                    setText("("+pessoa.getId()+")"+pessoa.getNome());
                }else{
                    setText(null);
                }
            };
        });


        lstPessoas.getItems().addAll(repositorio.listarPessoas());
        lstProdutos.getItems().addAll(repositorio.listarProdutos());
    }

}

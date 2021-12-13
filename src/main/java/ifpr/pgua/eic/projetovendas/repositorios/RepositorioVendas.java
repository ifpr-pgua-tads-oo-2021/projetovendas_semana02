package ifpr.pgua.eic.projetovendas.repositorios;

import java.util.ArrayList;

import ifpr.pgua.eic.projetovendas.models.Pessoa;
import ifpr.pgua.eic.projetovendas.models.Produto;

public class RepositorioVendas {
    
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Produto> produtos;

    public RepositorioVendas(){
        pessoas = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public boolean cadastrarPessoa(String nome, String email, String telefone){
        if(buscarPessoa(email)==null){
            this.pessoas.add(new Pessoa(nome,email,telefone));
            return true;
        }

        return false;
    }

    public Pessoa buscarPessoa(String email){
        return this.pessoas.stream().filter((pessoa)->pessoa.getEmail().equals(email)).findFirst().orElse(null);
    }

    public ArrayList<Pessoa> listarPessoas(){
        return pessoas;
    }

    public boolean cadastrarProduto(String nome, String descricao, int quantidadeEstoque, double valor){

        if(buscarProduto(nome) == null){
            this.produtos.add(new Produto(nome, descricao, quantidadeEstoque, valor));
            return true;
        }

        return false;
    }

    public Produto buscarProduto(String nome){
        return this.produtos.stream().filter((produto)->produto.getNome().equals(nome)).findFirst().orElse(null);
    }

    public ArrayList<Produto> listarProdutos(){
        return this.produtos;
    }
    
}

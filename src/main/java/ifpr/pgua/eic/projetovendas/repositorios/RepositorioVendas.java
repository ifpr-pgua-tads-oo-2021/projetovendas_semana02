package ifpr.pgua.eic.projetovendas.repositorios;

import java.util.ArrayList;

import ifpr.pgua.eic.projetovendas.models.Pessoa;

public class RepositorioVendas {
    
    private ArrayList<Pessoa> pessoas;

    public RepositorioVendas(){
        pessoas = new ArrayList<>();
    }

    public boolean cadastrarPessoa(String nome, String email, String telefone){
        return false;
    }

    public Pessoa buscarPessoa(String email){
        return null;
    }

    public ArrayList<Pessoa> listarPessoas(){
        return pessoas;
    }
    
}

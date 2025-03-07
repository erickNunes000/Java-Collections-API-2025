package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public List<Pessoa> getPessoasList() {
        return pessoasList;
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoasList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>lista = new ArrayList<>(pessoasList);
        Collections.sort(lista);
        return lista;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa>lista = new ArrayList<>(this.pessoasList);
        lista.sort(new CompararPorAltura());
        return lista;
    }
}

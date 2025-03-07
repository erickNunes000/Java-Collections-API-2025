package set.Ordenacao;

import java.util.*;

public class CadastroProduos {
    private Set<Produto>produtos;

    public CadastroProduos() {
        this.produtos = new HashSet<>();
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void adicionar(String nome, int cod, double preco, int qtd){
        this.produtos.add(new Produto(nome,cod,preco,qtd));
    }
    public void exibirPorNome(){
        List<Produto>lista = new ArrayList<>(this.produtos);
        Collections.sort(lista);
        for(Produto p:lista){
            System.out.println(p.toString());
        }
    }
    public void exibirPorPreco(){
        List<Produto>lista = new ArrayList<>(this.produtos);
        lista.sort(new OrdenarPorPreco());
        for(Produto p:lista){
            System.out.println(p.toString());
        }
    }
}

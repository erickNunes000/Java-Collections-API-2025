package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Item> carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item>target = new ArrayList<>();
        for(Item i:carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                target.add(i);
            }
        }
        this.carrinho.removeAll(target);
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Item i:carrinho){
            total+=(i.getPreco() * i.getQuantidade());
        }
        return total;
    }
    public void exibirItens(){
        for(Item i: carrinho){
            System.out.println(i.toString());
        }
    }

}

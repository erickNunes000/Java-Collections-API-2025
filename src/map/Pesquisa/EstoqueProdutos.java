package map.Pesquisa;

import java.util.*;

public class EstoqueProdutos {
    private Map<Long,Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public Map<Long, Produto> getEstoque() {
        return estoque;
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoque.put(cod, new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        for(Map.Entry<Long, Produto> ele:estoque.entrySet()){
            System.out.println(ele.getValue().toString());
        }
    }
    public double calcularValorTotalEstoque(){
        //if(estoque.isEmpty()){throw new RuntimeException("Estoque vazio");}
        double total = 0.0;
        for(Map.Entry<Long, Produto>item:estoque.entrySet()){
            total +=(item.getValue().getPreco() * item.getValue().getQuantidade());
        }
        return total;
    }
    public Produto obterMaisCaro(){
        Produto p = null;
        double ref=0.0;
        long refId = 0;
        for(Map.Entry<Long, Produto>item:estoque.entrySet()){
            if(ref<item.getValue().getPreco()){
                ref = item.getValue().getPreco();
                refId = item.getKey();
            }
        }
        p = estoque.get(refId);
        return p;
    }
    public Produto obterMaisBarato(){
        Produto p = null;

        List<Double> arr = new ArrayList<>();
        for(Map.Entry<Long, Produto>item:estoque.entrySet()){
            arr.add(item.getValue().getPreco());
        }
        Collections.sort(arr);
        for(Map.Entry<Long, Produto>item:estoque.entrySet()){
            if(item.getValue().getPreco()==arr.get(0)){
                p = item.getValue();
            }
        }
        //System.out.println("menor preco :"+arr);
        return p;
    }
    public Produto maiorValorTotal(){
        double total = 0.0;
        Produto p = null;
        for(Produto produto:estoque.values()){
            if(total < (produto.getPreco() * produto.getQuantidade())){
                total = produto.getPreco() * produto.getQuantidade();
                p = produto;
            }
        }
        return p;
    }

//    public static void main(String[] args) { //testes
//        EstoqueProdutos es = new EstoqueProdutos();
//        System.out.println(es.getEstoque());
//        es.adicionarProduto(1234, "pao",3,2.5);
//        es.adicionarProduto(1111, "refripao",10,5);
//        es.adicionarProduto(2222, "biscoito",3,1.5);
//        es.adicionarProduto(3333, "bigbig",2,0.5);
//        es.adicionarProduto(4444, "pizza",10,12.5);
//        es.exibirProdutos();
//        Produto caro = es.obterMaisCaro();
//        Produto barato = es.obterMaisBarato();
//        System.out.println("Mais Caro:\n");//pizza
//        System.out.println(caro.toString());
//        System.out.println("Mais Barato:\n");//bigbig
//        System.out.println(barato.toString());
//        System.out.println(es.calcularValorTotalEstoque());
//        System.out.println("produto com mair valor preco x quantidade:");
//        System.out.println(es.maiorValorTotal().toString());
//    }
}

package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private Integer cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getCod(), produto.getCod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    @Override
    public int compareTo(Produto other) {
        return this.getNome().compareToIgnoreCase(other.getNome());
    }
}
class OrdenarPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

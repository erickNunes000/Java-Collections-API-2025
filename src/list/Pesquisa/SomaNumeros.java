package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> lista ;

    public SomaNumeros() {
        this.lista = new ArrayList<>();
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }
    public void adicionarNumero(int numero){
        this.lista.add(numero);
    }
    public int calcularSoma(){
        int soma=0;
        for(int i=0;i<lista.size();i++){
            soma+=lista.get(i);
        }
        return soma;
    }
    public List<Integer> exibirNumeros(){
        return new ArrayList<>(this.lista);
    }
    public int encontrarMaiorNumero(){
        if(lista.isEmpty()){
            throw new RuntimeException("lista vazia");
        }
        Collections.sort(lista);
        return lista.get(lista.size()-1);
    }
    public int encontrarMenor(){
        int menor = lista.get(0);
        for(int i=0;i<lista.size();i++){
           if(lista.get(i)<menor){
               menor=lista.get(i);
           }
        }
        return menor;
    }
}

package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        this.catalogoLivros.add(livro);
    }
    public ArrayList<Livro> pesquisaPorAutor(String autor){//alternativa: use List<Livro> como retorno da função
        ArrayList<Livro>livros = new ArrayList<Livro>();
        //List<Livro>livros = new ArrayList<Livro>();
        if(catalogoLivros.isEmpty()) return null;
        for(Livro l:catalogoLivros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livros.add(l);
            }
        }
        return livros;
    }

    public ArrayList<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        ArrayList<Livro>livros = new ArrayList<Livro>();
        for(Livro l:catalogoLivros){
            if(l.getAno()>=anoInicial && l.getAno()<=anoFinal){
                livros.add(l);
            }
        }
        return livros;
    }

    public Object pesquisaPorTitulo(String titulo){
        if(catalogoLivros.isEmpty()){return null;}
        for(Livro l:catalogoLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }
      // var target= catalogoLivros.stream().filter(l->l.getTitulo().equalsIgnoreCas(titulo));System.out.println("Result: "+target);

        return null;
    }
}

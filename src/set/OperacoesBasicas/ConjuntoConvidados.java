package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjunto;

    public ConjuntoConvidados() {
        this.conjunto = new HashSet<>();
    }

    public Set<Convidado> getConjunto() {
        return conjunto;
    }

    public void setConjunto(Set<Convidado> conjunto) {
        this.conjunto = conjunto;
    }
    public void adicionarConvidado(String nome, int convite){
        this.conjunto.add(new Convidado(nome, convite));
    }
    public void removerPorCodigo(int convite){
        if(this.conjunto.isEmpty()){
            throw new RuntimeException("conjunto vazio");
        }
        for(Convidado c:conjunto){
            if(c.getConvite()==convite){
                conjunto.remove(c);
                break;
            }
        }
    }

    public void exibirConvidados(){
        for(Convidado c:conjunto){
            System.out.println(c.toString());
        }
    }
}

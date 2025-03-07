package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato>agenda;

    public AgendaContato() {
        this.agenda = new HashSet<>();
    }

    public Set<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(Set<Contato> agenda) {
        this.agenda = agenda;
    }

    public void adicionarContato(String nome, int telefone){
        this.agenda.add(new Contato(nome,telefone));
    }
    public void exibirContatos(){
        for(Contato c:agenda){
            System.out.println(c.toString());
        }
    }
    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato>target = new HashSet<>();
        if(agenda.isEmpty()){
            throw  new RuntimeException("agenda vazia");
        }
        for(Contato c:agenda){
            if(c.getNome().contains(nome)){
                target.add(c);
            }
        }
        return target;
    }
    public void atualizarContato(String nome, int novoNumero){
        if(agenda.isEmpty()){
            throw new RuntimeException("agenda vazia");
        }
        for(Contato c:agenda){
            if(c.getNome()==nome){
                c.setTelefone(novoNumero);
                break;
            }
        }

    }

}



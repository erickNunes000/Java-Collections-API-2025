package map.OperacoesBasicas;



import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer>contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public Map<String, Integer> getContatos() {
        return contatos;
    }

    public void adicionarContato(String nome, int telefone){
        this.contatos.put(nome,telefone);
    }
    public void removerContato(String nome){
        if(!this.contatos.isEmpty()){
            this.contatos.remove(nome);
        }
    }
    public void exibirContatos(){
        for(Map.Entry<String, Integer>ele:contatos.entrySet()){
            System.out.println("chave: "+ele.getKey() + " valor: "+ele.getValue());
        }

    }
    public Integer pesquisaContato(String nome){
        if(!contatos.isEmpty()){
            return contatos.get(nome);
        }
        return null;
    }

//    public static void main(String[] args) {//testes
//        AgendaContatos ag = new AgendaContatos();
//        System.out.println(ag.getContatos());
//        ag.adicionarContato("erico",123456);
//        ag.adicionarContato("fco",125859);
//        ag.adicionarContato("erico",558787);
//        ag.adicionarContato("ana",1234858);
//        System.out.println(ag.getContatos());
//        ag.exibirContatos();
//        ag.removerContato("ana");
//        ag.exibirContatos();
//        System.out.println(ag.pesquisaContato("fco"));
//
//    }
}

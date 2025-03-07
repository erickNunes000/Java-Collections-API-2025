package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        this.tarefaList.add(tarefa);
    }
    public void removerTarefa(String descricao){
        List<Tarefa>tarefasRem = new ArrayList<>();

        for(Tarefa t:tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasRem.add(t);
            }
        }
        tarefaList.removeAll(tarefasRem);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public ArrayList<String> obterdescricoesTarefas(){
        ArrayList<String> desc = new ArrayList<>();
        for(Tarefa t:tarefaList){
            desc.add(t.getDescricao());
        }
        return desc;
    }



}

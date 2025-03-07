package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public Map<LocalDate, Evento> getAgenda() {
        return agenda;
    }

    public void setAgenda(Map<LocalDate, Evento> agenda) {
        this.agenda = agenda;
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
            agenda.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento>eventostreeMap = new TreeMap<>(agenda);
        System.out.println(eventostreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento>eventostreeMap = new TreeMap<>(agenda);
        System.out.println(eventostreeMap);
        for(Map.Entry<LocalDate, Evento>ele:eventostreeMap.entrySet()){
            if(ele.getKey().isAfter(dataAtual)){
                System.out.println("Proximo Evento: "+ ele.getValue().toString()+ele.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {

        AgendaEventos ag = new AgendaEventos();
        ag.adicionarEvento(LocalDate.of(2025, Month.JULY,15),"evento 2","atracao 2" );

        ag.adicionarEvento(LocalDate.of(2025, 7,9),"evento 3","atracao 3" );

        ag.adicionarEvento(LocalDate.of(2020, Month.JANUARY,10),"evento 4","atracao 4" );

        ag.exibirAgenda();
        ag.obterProximoEvento();
    }


}


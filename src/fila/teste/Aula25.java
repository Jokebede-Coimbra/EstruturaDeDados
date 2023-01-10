package fila.teste;

import fila.FilaComPrioridade;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        //  Queue<Paciente> filaComPrioridade = new PriorityQueue<>();


        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                      //  return Integer.compare(p1.getPrioridade(), p2.getPrioridade());
                        return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                    }
                }
        );
        filaComPrioridade.add(new Paciente("C", 2));
        filaComPrioridade.add(new Paciente("A", 1));

        System.out.println(filaComPrioridade);
    }
}

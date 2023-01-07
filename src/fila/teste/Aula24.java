package fila.teste;

import fila.FilaComPrioridade;

import java.util.LinkedList;
import java.util.Queue;

public class Aula24 {

    public static void main(String[] args) {

      /*  FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);

        System.out.println(fila); // 1 2 3  e não 1 3 2
        fila.desenfileirar();
        System.out.println(fila);*/

        // exemplo 2
        FilaComPrioridade<Paciente> fila2 = new FilaComPrioridade<>();

        fila2.enfileirar(new Paciente("A", 2));
        fila2.enfileirar(new Paciente("C", 1));
        fila2.enfileirar(new Paciente("B", 3));

        System.out.println(fila2);
        System.out.println(fila2.espiar());
        System.out.println(fila2.desenfileirar());
        System.out.println(fila2);
    }
}

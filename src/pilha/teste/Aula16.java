package pilha.teste;

import pilha.Pilha;

public class Aula16 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.empliha(1);
        pilha.empliha(2);

        System.out.println(pilha.topo());

        System.out.println(pilha);
    }
}

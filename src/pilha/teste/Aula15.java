package pilha.teste;

import pilha.Pilha;

public class Aula15 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empliha(14);

        System.out.println(pilha.estaVazia());
    }
}

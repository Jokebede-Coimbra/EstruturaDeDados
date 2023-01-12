package fila.labs;

import fila.Fila;

public class Exer02 {

    public static void main(String[] args) {

        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileirar("Pessoa 1");
        regular.enfileirar("Pessoa 2");
        regular.enfileirar("Pessoa 3");
        regular.enfileirar("Pessoa 4");
        regular.enfileirar("Pessoa 5");
        prioridade.enfileirar("Pessoa P1");
        prioridade.enfileirar("Pessoa P2");
        prioridade.enfileirar("Pessoa P3");
        prioridade.enfileirar("Pessoa P4");
        prioridade.enfileirar("Pessoa P5");
        regular.enfileirar("Pessoa 6");
        regular.enfileirar("Pessoa 7");
        regular.enfileirar("Pessoa 8");
        regular.enfileirar("Pessoa 9");
        regular.enfileirar("Pessoa 10");

        // Desenfileirando

        while (!regular.estaVazia() || !prioridade.estaVazia()) {
            int cont = 0;

            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE) { // Se três pessoas foram atendidas
                atendePessoa(prioridade);
                cont++;
            }

            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }

            if (prioridade.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);
                }
            }
        }

    }

    public static void atendePessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida + " foi atendida.");
    }
}
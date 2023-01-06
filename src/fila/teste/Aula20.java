package fila.teste;

import fila.Fila;

public class Aula20 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(2);
        fila.enfileirar(22);
        fila.enfileirar(222);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        System.out.println(fila);

    }
}

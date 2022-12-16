package vetor.teste;

import vetor.Vetor;

public class VetorTeste04 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println("Buscando o elemento: " + vetor.busca("elemento 1"));
        System.out.println("Buscando o elemento: " + vetor.busca("elemento 5"));

    }
}


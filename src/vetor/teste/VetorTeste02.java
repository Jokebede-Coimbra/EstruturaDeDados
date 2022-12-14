package lista.teste;

import vetor.Vetor;

public class VetorTeste02 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);
        vetor.adiciona("Jokebede");
        vetor.adiciona("Jayanne");
        vetor.adiciona("Josué");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);

    }
}


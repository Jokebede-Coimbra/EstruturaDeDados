package vetor.teste;

import vetor.Vetor;

public class VetorTeste03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        vetor.adiciona("Jokebede");
        vetor.adiciona("Jayanne");
        vetor.adiciona("Josué");

        System.out.println(vetor.busca(5));

    }
}


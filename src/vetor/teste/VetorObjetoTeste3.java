package vetor.teste;

import vetor.Contato;
import vetor.Lista;

public class VetorObjetoTeste3 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("c1", "852","c1@gamil.com");
        Contato c2 = new Contato("c2", "752","c2@gamil.com");

      vetor.adiciona(c1);

        System.out.println(vetor);
    }
}

package vetor.teste;

import vetor.Contato;
import vetor.VetorObjetos;

public class VetorObjetoTeste2 {

    public static void main(String[] args) {

        VetorObjetos vetorObjetos = new VetorObjetos(3);
        Contato contato1 = new Contato("Jayanne", "69856-6325", "jay@gamil.com");
        Contato contato2 = new Contato("Josué", "97854-6325", "jos@gamil.com");
        Contato contato3 = new Contato("Jacson", "85263-6325", "jac@gamil.com");

        Contato contato4 = new Contato("Jacson", "85263-6325", "jac@gamil.com");
        vetorObjetos.adiciona(contato1);
        vetorObjetos.adiciona(contato2);
        vetorObjetos.adiciona(contato3);

        System.out.println("Tamanho = " + vetorObjetos.tamanho());

        int pos = vetorObjetos.busca(contato4);
        if (pos > -1) {
            System.out.println("Elemento existe o vetor");
        } else {
            System.out.println("Elemento não existe o vetor");
        }
        System.out.println(vetorObjetos);
    }
}

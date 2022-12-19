package vetor.labs;

import vetor.Lista;

public class Exer03 {
    public static void main(String[] args) {




        Lista<String> lista = new Lista<>(5);

        lista.adiciona("Jayanne");
        lista.adiciona("Jacilene");
        lista.adiciona("Josué");
        lista.adiciona("Jacson");
        lista.adiciona("Ivanete");

        System.out.println("Lista original :" + lista);

        lista.remove("Jacilene");

        System.out.println("Lista com remoção :" + lista);

        lista.remove("Josué");

        System.out.println("Lista com remoção :" + lista);

    }
}

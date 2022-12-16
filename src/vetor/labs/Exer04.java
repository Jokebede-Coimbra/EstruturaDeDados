package vetor.labs;

import vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {


        Lista<String> lista = new Lista<>(5);

        lista.adiciona("Jayanne");
        lista.adiciona("Jacilene");
        lista.adiciona("Josué");
        lista.adiciona("Jacson");
        lista.adiciona("Ivanete");

        System.out.println("Lista original :" + lista);
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(3));



    }
}

package vetor.labs;

import vetor.Lista;

public class Exer01 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("Jayanne");
        lista.adiciona("Josué");
        lista.adiciona("Jacson");


        System.out.println(lista.contem("Samarah"));
        System.out.println(lista.contem("Jayanne"));
        System.out.println(lista.contem("Jacilene"));
    }
}

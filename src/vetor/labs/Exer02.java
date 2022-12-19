package vetor.labs;

import vetor.Lista;

import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("Jayanne");
        arrayList.add("Josué");
        arrayList.add("Jacson");

        System.out.println(arrayList.lastIndexOf("Jayanne"));

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("Jayanne");
        lista.adiciona("Jacilene");
        lista.adiciona("Jayanne");

        System.out.println(lista.ultimoIndice("Jayanne"));

    }
}

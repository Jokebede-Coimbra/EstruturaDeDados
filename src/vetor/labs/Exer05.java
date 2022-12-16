package vetor.labs;

import vetor.Lista;

import java.util.ArrayList;

public class Exer05 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);


        Lista<String> lista = new Lista<>(5);

        lista.adiciona("Jayanne");
        lista.adiciona("Jacilene");
        lista.adiciona("Josué");
        lista.adiciona("Jacson");
        lista.adiciona("Ivanete");


        System.out.println("Lista original :" + lista);
        lista.limpar();
        System.out.println("Lista original :" + lista);


    }
}

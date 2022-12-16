package vetor.teste;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "D");

        System.out.println(arrayList);

        // tipo o método busca
        boolean existe = arrayList.contains("B");
        // Como existe é um booleano não preciso fazer comparações > existe == true
        if (existe) {
            System.out.println("Elemente existe no array, na posição : " + arrayList.indexOf("B"));
        } else {
            System.out.println("Elemente não existe no array");
        }

        int pos = arrayList.indexOf("E");
        if (pos > -1) {
            System.out.println("Elemento na posição: " + pos);
        } else {
            System.out.println("Elemento não encontrado: " + pos);
        }

        // busca por posição
        System.out.println("Busca por posição: " + arrayList.get(2));

        // removendo
        arrayList.remove(0);
        arrayList.remove("D");

        System.out.println(arrayList);

        // tamanho
        System.out.println("Tamanho do array: " + arrayList.size());
    }

}

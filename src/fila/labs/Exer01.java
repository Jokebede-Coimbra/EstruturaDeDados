package fila.labs;

import fila.Fila;

public class Exer01 {

    public static void main(String[] args) {

        Fila<Documento> doc = new Fila<>();

        doc.enfileirar(new Documento("Doc A", 250));
        doc.enfileirar(new Documento("Doc B", 260));
        doc.enfileirar(new Documento("Doc C", 270));
        doc.enfileirar(new Documento("Doc D", 280));

        System.out.println("=====Imprimindo=====");
        System.out.println(doc);

        System.out.println("=====Desenfileirando=====");
        while (!doc.estaVazia()) {
            System.out.println("Imprimindo o documento: " + doc.desenfileirar());

        }
        System.out.println("A lista de documentos está fazia? " + doc.estaVazia());
    }

}

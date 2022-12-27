package pilha.labs;

import pilha.Pilha;

public class Exer05 {

    public static void main(String[] args) {

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("MARIA");

    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }

}

package pilha.labs;

import pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        Pilha<String> pilha = new Pilha<>();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Entre com os números decimais: ");
            int num = sc.nextInt();
            String binario = Integer.toBinaryString(num);
            pilha.empilha(binario);

        }

        System.out.println(pilha);*/

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(27);
        imprimeResultadoQualquerBase(25, 16);
        imprimeResultadoQualquerBase(10035, 8);
        imprimeResultadoQualquerBase(10035, 16);
    }


    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) {
        System.out.println(numero + " na base : " + base + " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> stack = new Stack<>();
        String binario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            stack.push(resto);
            numero /= 2;
        }
        while (!stack.isEmpty()) {
            binario += stack.pop();
        }
        return binario;
    }

    // Qualquer base
    public static String decimalQualquerBase(int numero, int base) {

        if (base > 16) {
            throw new IllegalArgumentException();
        }
        
        Stack<Integer> stack = new Stack<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            stack.push(resto);
            numero /= base;
        }
        while (!stack.isEmpty()) {
            numBase += bases.charAt(stack.pop());
        }
        return numBase;
    }
}

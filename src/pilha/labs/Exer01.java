package pilha.labs;

import pilha.Pilha;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<>();

        int num;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite os números: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Empilhando o número: " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("A pilha está vazia!");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha:  " + desempilhado);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha: ");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha:  " + pilha.desempilha());
        }
        System.out.println("Todos os elemnetos foram desempilhados");

    }


       /* Stack<Integer> stack = new Stack<>();
        int num;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite os números: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                stack.push(num);
            } else {
                System.out.println(stack.pop());
            }
        }
        System.out.println(stack);
        if (stack.isEmpty()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }*/

}

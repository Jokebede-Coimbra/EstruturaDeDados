package pilha.teste;

import pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty()); // está vazia?

        stack.push(11); // empilha
        stack.push(12);
        stack.push(13);
        stack.push(14);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek());// verificar

        System.out.println(stack.pop());// desempilha

        System.out.println(stack);

    }
}

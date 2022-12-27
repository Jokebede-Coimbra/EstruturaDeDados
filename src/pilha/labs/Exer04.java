package pilha.labs;

import pilha.Pilha;

import java.util.Stack;

public class Exer04 {

    public static void main(String[] args) {


        Stack<Livro> stack = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structures and Algorithms - Second Edition");
        livro1.setAutor("Loiane Groner");
        livro1.setAnoLancamento(2012);
        livro1.setIsbn("X200");

        Livro livro2 = new Livro();
        livro2.setNome("Internet e Redes Sociais");
        livro2.setAutor("Thiago R");
        livro2.setAnoLancamento(2012);
        livro2.setIsbn("X201");


        Livro livro3 = new Livro();
        livro3.setNome("Java");
        livro3.setAutor("Pedro M");
        livro3.setAnoLancamento(2019);
        livro3.setIsbn("X203");

        Livro livro4 = new Livro();
        livro4.setNome("Segurança e Criptografia");
        livro4.setAutor("Loiane Groner");
        livro4.setAnoLancamento(2000);
        livro4.setIsbn("X204");

        System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());

        System.out.println("Empilhando livros na pilha: ");

        stack.push(livro1);
        stack.push(livro2);
        stack.push(livro3);
        stack.push(livro4);

        System.out.println(stack.size() + " livros foram empilhados: ");
        System.out.println(stack);

        System.out.println("Pilha de livros criada, pilha está vazia? " + stack.isEmpty());

        System.out.println("Espiando o topo da pilha: " + stack.peek());
        System.out.println("Desmpilhando livros da pilha: ");

        while (!stack.isEmpty()) {
            System.out.println("Desempilhando livro: " + stack.pop());
        }
        System.out.println("Todos os livros foram desempilhados,  pilha vazia: " + stack.isEmpty());

    }
}


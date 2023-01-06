package pilha.labs;

import pilha.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite os números: ");
            int num = sc.nextInt();

            if (num == 0) {
                Integer pPar = par.desempilha();
                Integer iImpar = impar.desempilha();

                if (pPar == null || iImpar == null) {
                    System.out.println("A pilha está vazia!");
                }
                System.out.println("Número 0, desempilhando um elemento par da pilha:  " + pPar);

                System.out.println("Número 0, desempilhando um elemento ímpar da pilha:  " + iImpar);

            } else if (num % 2 == 0) {
                System.out.println("Númemro par, empilhando na pilha par:  " + num);
                par.empilha(num);
            } else {
                System.out.println("Númemro ímpar, empilhando na pilha ímpar:  " + num);
                impar.empilha(num);
            }

        }

        // Desempilhando tudo
        System.out.println("--Desempilhando todos números da pilha par e ímpar--");
        while (!par.estaVazia() && impar.estaVazia()) {
            System.out.println("Desempilhando um elemento do par: " + par.desempilha());
            System.out.println("Desempilhando um elemento do impar: " + impar.desempilha());
        }
        System.out.println("Todos os elementos foram desempilhados");

        System.out.println(par);
        System.out.println(impar);
    }
}
/*
*for (int i=1; i<=10; i++){

			System.out.println("Entre com um número: ");

			int num = scan.nextInt();

			if (num == 0){

				//pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}

				//pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}


			} else if (num % 2 == 0){
				System.out.println("Número par, empilhando na pilha par: " + num);
				par.empilha(num);
			} else {
				System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
				impar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os números da pilhar par");

		while (!par.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}

		System.out.println("Desempilhando todos os números da pilhar ímpar");

		while (!impar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
		}

	}
 */
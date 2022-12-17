package vetor.labs;

import vetor.Contato;
import vetor.Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06 {
    public static void main(String[] args) {

        // criação das variáveis
        Scanner sc = new Scanner(System.in);

        // criar vetor ou lista com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<Contato>(20);

        // criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        // 1 - criar um menu para que o usuário escolha a opção
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(sc);
            switch (opcao) {
                case 1:
                    adicionaContatoFinal(sc, lista);
                    break;
                case 2:
                    adicionaContatoPosicao(sc, lista);
                    break;
                case 3:
                    obtemContatoPosicao(sc, lista);
                    break;
                case 4:
                    obtemContato(sc, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(sc, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(sc, lista);
                    break;
                case 7:
                    excluirPorPosicao(sc, lista);
                    break;
                case 8:
                    excluirContato(sc, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou  0, programa finalizado");
    }

    private static void imprimirVetor(ArrayList<Contato> lista) {

        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é de : " + lista.size());
    }

    private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {

            Contato contato = lista.get(pos);
            lista.remove(contato);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {

            lista.remove(pos);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if (existe) {
                System.out.println("Contato existe, seguem os dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato  não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionaContatoFinal(Scanner sc, ArrayList<Contato> lista) {

        System.out.println("====Criando um contato, entre com as informações====");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o e-mail: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato); // chama o toString
    }

    private static void adicionaContatoPosicao(Scanner sc, ArrayList<Contato> lista) {

        System.out.println("====Criando um contato, entre com as informações====");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o e-mail: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição para adicionar o contato", sc);

        try {
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato); // chama o toString
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");

        }
    }


    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
// é uma boa pratica instancia fora do loop
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}

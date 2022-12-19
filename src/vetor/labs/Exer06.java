package vetor.labs;

import vetor.Contato;
import vetor.Lista;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        // criação das variáveis
        Scanner sc = new Scanner(System.in);

        // criar vetor ou lista com 20 de capacidade
        Lista<Contato> lista = new Lista<Contato>(20);

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

    private static void imprimirVetor(Lista<Contato> lista) {

        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de : " + lista.tamanho());
    }

    private static void excluirContato(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {

            Contato contato = lista.busca(pos);
            lista.remove(contato);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {

            lista.remove(pos);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

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

    private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionaContatoFinal(Scanner sc, Lista<Contato> lista) {

        System.out.println("====Criando um contato, entre com as informações====");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o e-mail: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato); // chama o toString
    }

    private static void adicionaContatoPosicao(Scanner sc, Lista<Contato> lista) {

        System.out.println("====Criando um contato, entre com as informações====");
        String nome = lerInformacao("Entre com o nome: ", sc);
        String telefone = lerInformacao("Entre com o telefone: ", sc);
        String email = lerInformacao("Entre com o e-mail: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        int pos = lerInformacaoInt("Entre com a posição para adicionar o contato", sc);

        try {
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato); // chama o toString
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");

        }
    }

    protected static String lerInformacao(String msg, Scanner sc) {
        System.out.println(msg);
        String entrada = sc.nextLine();
        return entrada;
    }

    protected static int lerInformacaoInt(String msg, Scanner sc) {

        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {

            try {
                System.out.println(msg);
                String entrada = sc.nextLine();

                num = Integer.parseInt(entrada);
                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;

    }

    protected static int obterOpcaoMenu(Scanner sc) {

        boolean entradaValida = false;
        String entrada;
        int opcao = 0;

        while (!entradaValida) {
            System.out.println("===================================");
            System.out.println("------Digite a opção desejada------");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Exclui por posição");
            System.out.println("8: Exclui contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Exclui todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");
            System.out.println("===================================");

            try {
                entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                // opcao = sc.nextInt();
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
// é uma boa pratica instancia fora do loop
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}

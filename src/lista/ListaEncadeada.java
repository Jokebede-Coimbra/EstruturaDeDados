package lista;

public class ListaEncadeada<T> {


    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;



    public void adiciona(T elemento) {
        No<T> no = new No<T>(elemento);
        if (this.tamanho == 0) { // verificando se existe algo na lista
            this.inicio = no; // Apontando para no criado
        } else {
            this.ultimo.setProximo(no);
        }
        this.ultimo = no;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limpar() {
        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo(); // variável próximo está referenciando o númro dois
            atual.setElemento(null); //
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {

        // [1,2,3,4]
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        No<T> atual = this.inicio;

       /* sb.append(atual.getElemento()).append(",");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            sb.append(atual.getElemento()).append(",");
        }
        */

        for (int i = 0; i < this.tamanho - 1; i++) { // -1 > para no penultimo elemento da lista
            sb.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        sb.append(atual.getElemento()).append("]");
        return sb.toString();
    }
}

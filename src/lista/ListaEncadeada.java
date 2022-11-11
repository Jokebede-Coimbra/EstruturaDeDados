package lista;

public class ListaEncadeada<T> {


    private No<T> inicio;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> no = new No<T>(elemento);
        this.inicio = no; // Apontando para no criado
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [" +
                "inicio: " + inicio +
                ']';
    }
}

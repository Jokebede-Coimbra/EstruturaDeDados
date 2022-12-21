package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {

        if (this.estaVazia()) {
            return null;
        }
        // opção 1
       /* T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento; */

        // opção 2 > simplificando
        return this.elementos[--tamanho];
    }

}

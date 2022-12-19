package vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {

    private T[] elementos;
    private int tamanho = 0;

    // primeira solucao, mais elegante
    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // segunda solucao
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        // Verificando se a posição é valida
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        // iterando de tras p/ frente
        // mover todos os elemenentos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // reutilizando o metodo busca
    public T obtem(int posiaco) {
        return this.busca(posiaco);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Melhorando o método busca
    public boolean contem(T elemento) {
        // opção 1
       /* int pos = busca(elemento);
        if (pos > -1) {
            return true;
        }
        return  false; */
        // opção 2
        return busca(elemento) > -1; // ou  >= 0
    }

    // B G D E F > Posição a ser removida é 1 (G)
    // 0 1 2 3 4 > tamanho é 5
    // vetor[1] =  vetor[2]
    // vetor[2]= vetort[3]
    // vetor[3]= vetort[4]
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);

        }
    }

    public void limpar() {
        // opção 1
        //  this.elementos = (T[]) new Object[this.elementos.length];
        // opção 2
        // this.tamanho = 0;
        // opção 3
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int ultimoIndice(T elemento) {
        // opção 1 > custosa
        /*int ultimaPos = -1;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                ultimaPos = i; // atualiza
            }
        }
        return ultimaPos;
        */
        // iterando de tras p/frente > opção 2 > melhor
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i; // atualiza
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(elementos[i]);
            sb.append("]");
        }
        if (this.tamanho > 0) {
            sb.append(elementos[this.tamanho - 1]);
        }
        sb.append("]");
        return Arrays.toString(elementos);
    }
}

package fila.labs;

import fila.Fila;

public class Documento<T> extends Fila<T> {

    private String nome;
    private int quantidadeDeFolhas;


    public Documento() {
    }

    public Documento(String nome, int quantidadeDeFolhas) {
        this.nome = nome;
        this.quantidadeDeFolhas = quantidadeDeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeFolhas() {
        return quantidadeDeFolhas;
    }

    public void setQuantidadeDeFolhas(int quantidadeDeFolhas) {
        this.quantidadeDeFolhas = quantidadeDeFolhas;
    }

    @Override
    public String toString() {
        return "Documentos:" +
                "nome='" + nome + '\'' +
                ", quantidadeDeFolhas=" + quantidadeDeFolhas;
    }
}

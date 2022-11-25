package vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho = 0; // vai controlar o tamanho real do vetor

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    /* public void adiciona(String elemento) {
         for (int i = 0; i < this.elementos.length; i++) {
             if (this.elementos[i] == null) {
                 this.elementos[i] = elemento;
             }
         }
     }*/

    // Melhorando o método adciona
    /*public void adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento; // adicinando o elemento no vetor
            this.tamanho++; // incrementando no valor também
        } else {
            try {
                throw new Exception("Não é possível adicionar elementos no vetor cheio");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }*/
    // Melhorando o método adciona 2
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento; // adicinando o elemento no vetor
            this.tamanho++; // incrementando no valor também
            return true;
        }
        return false;
    }
}

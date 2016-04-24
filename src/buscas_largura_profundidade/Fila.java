

package buscas_largura_profundidade;

/**
 *
 * @author ALEXANDRE GOMES CAZAROES
 * 
 */
public class Fila {

    private static final int tamanhoDaFila = 100;
    private int itens[];
    private int total;
    
    public Fila() {
        itens = new int[tamanhoDaFila];
        total = 0;
    }
    
    public void push (int valor) {
        if (isFull()) {
            System.out.println("Fila cheia");
            return;
        }
        int indice = total;
        total++;
        itens[indice] = valor;
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return 0;
        }
        int valor = itens[0];
        for (int i = 0; i < (total-1); i++)
            itens[i] = itens[i+1];
        total--;
        return valor;
    }
    
    public boolean isEmpty () {
        if (total == 0)
            return true;
        return false;
    }
    
    public boolean isFull () {
        if (total >= tamanhoDaFila)
            return true;
        return false;
    }
    
    public int peek () {
        return itens[0];  
    }
    
}
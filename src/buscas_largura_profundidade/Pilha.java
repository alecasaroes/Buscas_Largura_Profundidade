
package buscas_largura_profundidade;

/**
 *
 * @author alexandre.gcazaroes1
 * 
 */
public class Pilha {

    private static final int tamanhoDaPilha = 100;
    private int itens[];
    private int topo;
    
    public Pilha () {
        itens = new int[tamanhoDaPilha];
        topo = -1;
    }
    
    public void push (int valor) {
        if (isFull()) {
            System.out.println("Pilha cheia");
            return;
        } 
        topo++;
        int indice = topo;
        itens[indice] = valor;
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return 0;
        }
        int indice = topo;
        topo--;
        return itens[indice];
    }
    
    public boolean isEmpty () {
        if (topo < 0)
            return true;
        return false;
    }
    
    public boolean isFull () {
        if ((topo+1) >= tamanhoDaPilha)
            return true;
        return false;
    }
    
    public int peek () {
        return itens[topo];  
    }
    
}
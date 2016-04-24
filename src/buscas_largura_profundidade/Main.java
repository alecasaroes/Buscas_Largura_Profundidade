package buscas_largura_profundidade;

/**
 *
 * @author ALEXANDRE GOMES CAZAROES
 * 
 */
public class Main {
       
    public static void main(String[] args) {
        
        MatrizAdjacente grafo = new MatrizAdjacente();
        
        
        //+++++++++++++ BUSCA EM LARGURA GRAFO ADJACENTE +++++++++++++++//
        System.out.println("\nRESULTADOS DA IMPLEMENTAÇÃO DE BUSCA EM LARGURA:"
                + "\n====================================\nAULA 5, SLIDE 37, EXEMPLO 1:\n");
        
        grafo.criarGrafo(5);
        
        grafo.inserirAresta(1, 2);
        grafo.inserirAresta(1, 3);
        grafo.inserirAresta(1, 4);
        grafo.inserirAresta(1, 5);
        grafo.inserirAresta(2, 1);
        grafo.inserirAresta(2, 3);
        grafo.inserirAresta(2, 5);
        grafo.inserirAresta(3, 1);
        grafo.inserirAresta(3, 2);
        grafo.inserirAresta(3, 4);
        grafo.inserirAresta(3, 5);
        grafo.inserirAresta(4, 1);
        grafo.inserirAresta(4, 3);
        grafo.inserirAresta(4, 5);
        grafo.inserirAresta(5, 1);
        grafo.inserirAresta(5, 2);
        grafo.inserirAresta(5, 3);
        grafo.inserirAresta(5, 4);
        
        grafo.imprimirGrafo();
        
        grafo.buscaEmLargura(grafo, 2);
        
        System.out.println("====================================");
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        
        //++++++++++ BUSCA EM LARGURA GRAFO ORIENTADO (DIGRAFO) ++++++++//
        
        System.out.println("===================================="
                + "\nAULA 5, SLIDE 37, EXEMPLO 2 GRAFO ORIENTADO:\n");
        
        grafo.criarGrafo(5);
        
        grafo.inserirAresta(1, 3);
        grafo.inserirAresta(1, 4);
        grafo.inserirAresta(2, 1);
        grafo.inserirAresta(2, 3);
        grafo.inserirAresta(3, 4);
        grafo.inserirAresta(5, 1);
        grafo.inserirAresta(5, 2);
        grafo.inserirAresta(5, 3);
        grafo.inserirAresta(5, 4);

        grafo.imprimirGrafo();
        
        grafo.buscaEmLargura(grafo, 2);
        
        System.out.println("===================================="
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++");
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        
        
        //===============================================================//
        
        //++++++++++++++++++++ BUSCA EM PROFUNDIDADE ++++++++++++++++++++//
        
        System.out.println("\nRESULTADOS DA IMPLEMENTAÇÃO DE BUSCA EM PROFUNDIDADE:"
                + "\n====================================\nAULA 5, SLIDE 59, EXEMPLO 1:\n");
        
        grafo.criarGrafo(6);
        
        grafo.inserirAresta(1, 2);
        grafo.inserirAresta(1, 6);
        grafo.inserirAresta(2, 1);
        grafo.inserirAresta(2, 3);
        grafo.inserirAresta(2, 5);
        grafo.inserirAresta(3, 2);
        grafo.inserirAresta(3, 4);
        grafo.inserirAresta(4, 3);
        grafo.inserirAresta(5, 2);
        grafo.inserirAresta(6, 1);
        
        grafo.imprimirGrafo();
        
        grafo.buscaEmProfundidade(grafo, 1);
        
        System.out.println("====================================");
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        
        System.out.println("===================================="
                + "\nAULA 5, SLIDE 41, EXEMPLO 2:\n");
        
        grafo.criarGrafo(5);
        
        grafo.inserirAresta(1, 2);
        grafo.inserirAresta(1, 3);
        grafo.inserirAresta(2, 1);
        grafo.inserirAresta(2, 3);
        grafo.inserirAresta(3, 1);
        grafo.inserirAresta(3, 2);
        grafo.inserirAresta(3, 4);
        grafo.inserirAresta(3, 5);
        grafo.inserirAresta(4, 3);
        grafo.inserirAresta(4, 5);
        grafo.inserirAresta(5, 3);
        grafo.inserirAresta(5, 4);
        
        grafo.imprimirGrafo();
        
        grafo.buscaEmProfundidade(grafo, 2);
        
        System.out.println("====================================\n\nFIM =D");
    }
    
}

package buscas_largura_profundidade;

/**
 *
 * @author alexandre.gcazaroes
 * 
 */
public class Main {
       
    public static void main(String[] args) {
        
        MatrizAdjacente grafo = new MatrizAdjacente();
        
        
        //+++++++++++++ BUSCA EM LARGURA GRAFO ADJACENTE +++++++++++++++//
        System.out.println("\nRESULTADOS DA IMPLEMENTAÇÃO DE BUSCA EM LARGURA:"
                + "\n====================================\nEXEMPLO 1:\n");
        
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
                + "\nEXEMPLO 2 GRAFO ORIENTADO:\n");
        
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
                + "\n====================================\n");
        
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
        
        
        
        System.out.println("====================================");
        
        
    }
    
}


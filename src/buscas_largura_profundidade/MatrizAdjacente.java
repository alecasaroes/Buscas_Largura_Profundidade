package buscas_largura_profundidade;

/**
 *
 * @author alexandre.gcazaroes
 * 
 */
public class MatrizAdjacente {
    
    private int numeroDeVertices;
    private int matrizAdjacente[][];
    
    MatrizAdjacente(){
    }
    
    public void criarGrafo (int numeroDeVertices){
        this.numeroDeVertices = numeroDeVertices;
        matrizAdjacente = new int [numeroDeVertices][numeroDeVertices];
    }

    public void inserirAresta(int verticeOrigem, int verticeDestino){
        matrizAdjacente[verticeOrigem-1][verticeDestino-1] = 1;
    }
    
    public void removerAresta(int verticeOrigem, int verticeDestino){
        matrizAdjacente[verticeOrigem-1][verticeDestino-1] = 0;
    }
    
    public void existeAresta(int verticeOrigem, int verticeDestino){
        System.out.println("OPERACAO SOLICITADA: Existe aresta de v" + verticeOrigem + " à v" + verticeDestino + "?");
        if(matrizAdjacente[verticeOrigem-1][verticeDestino-1] == 1)
            System.out.println("EXISTE ARESTA DE v" + verticeOrigem + " à v" + verticeDestino);
        else
            System.out.println("NÃO EXISTE ARESTA DE v" + verticeOrigem + " à v" + verticeDestino);
    }
    
    public Fila ListaDeVerticesAdjacenciaAoVertice(int vertice){
        Fila lista = new Fila();
        for (int i = 0; i < numeroDeVertices; i++) {
            if (matrizAdjacente[vertice-1][i] == 1)
                lista.push((i+1));
        }
        return lista;
    }
    
    public void imprimirGrafo(){
        System.out.print("    ");
        for (int k = 0; k < numeroDeVertices; k++) 
            System.out.print("v" + (k+1) + " ");
        System.out.println("");
        for (int i = 0; i < matrizAdjacente.length; i++){
            System.out.print("v" + (i+1) + " [ " + matrizAdjacente[i][0]);
            for (int j = 1; j < matrizAdjacente[0].length; j++){
                System.out.print(", " + matrizAdjacente[i][j]);
            }
            System.out.print(" ]\n");
        }
        System.out.println("");
    }

    public int getNumeroDeVertices() {
        return numeroDeVertices;
    }
    
    
    public void buscaEmLargura(MatrizAdjacente grafo, int verticeInicialArbitrario) {
        Fila fila = new Fila();
        Fila verticesAdjacentes = new Fila();
        char verticesVisitados[] = new char [grafo.getNumeroDeVertices()];
        int verticeArbitrario = verticeInicialArbitrario;
        fila.push(verticeArbitrario);
        System.out.println("Vertice Inicial Arbitrario: v" + verticeArbitrario);
        System.out.print("Ordem visitada: ");
        while(!fila.isEmpty()){
            int verticeVisitado = fila.peek();
            fila.pop();
            verticesVisitados[verticeVisitado-1] = 'V';
            System.out.print("v" + verticeVisitado + ", ");
            verticesAdjacentes = grafo.ListaDeVerticesAdjacenciaAoVertice(verticeVisitado);
            while(!verticesAdjacentes.isEmpty()){
                int proxVertice = verticesAdjacentes.peek();
                if (verticesVisitados[proxVertice-1] != 'V' && verticesVisitados[proxVertice-1] != 'P'){
                    fila.push(proxVertice);
                    verticesVisitados[proxVertice-1] = 'P';
                }
                verticesAdjacentes.pop();
            }
        }
        System.out.println("");
    }
    
    
    
}


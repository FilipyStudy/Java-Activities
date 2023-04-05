public class AlgoritmoBhaskara {
    //cria as constantes
    private int a, b, c;
    // define Delta, o total e as resoluções positivas e negativas
    int delta, resolucaoUm, resolucaoDois;
    //define o array que recebe e armazena as resoluções
    int[] solucaoFinal = new int[2];
    
    AlgoritmoRaizQuadrada raiz = new AlgoritmoRaizQuadrada();
    public int[] bhaskara(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        //calcula Delta
        b = b * b;
        delta = b - 4 * (a * c);
        
        //calcula as resoluções com o algoritmo de raiz quadrada
        resolucaoUm = (raiz.raizQuadrada(delta)- b) / (2 * a);
        resolucaoDois = (raiz.raizQuadrada(delta)+ b) / (2 * a);
        
        //armazena as resoluções
        solucaoFinal[0] = resolucaoUm;
        solucaoFinal[1] = resolucaoDois;
        
        return solucaoFinal;
    }

public class AlgoritmoRaizQuadrada {

    public static int raizQuadrada(int base) {
        int raizQuadrada = 0;
        int contador = 1;
        do{
            contador++;
            raizQuadrada = contador;
        }
        while (contador * contador != base);
        return raizQuadrada;
    }
}

public class AlgoritmoPotenciacao {

    public static int potencia (int base, int expoente){
        int numeroReserva = base;
        if (expoente == 0)
            return 1;
        else if (expoente == 1)
            return base;
        else if (expoente >= 2){
            int contagem = expoente - 1;
            do{
                numeroReserva = numeroReserva * base;
                contagem --;
            }
            while (contagem > 0);
        }
        return numeroReserva;
    }
}

public class AlgoritmoPotenciacao {

    public static int potencia (int base, int expoente){
        int numero = base;
        if (expoente == 0)
            return 1;
        else if (expoente == 1)
            return base;
        else if (expoente >= 2){
            int contagem = expoente - 1;
            do{
                numero = numero * base;
                contagem --;
            }
            while (contagem > 0);
        }
        return numero;
    }
}

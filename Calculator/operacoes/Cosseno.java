package operacoes;

public class Cosseno {
    public static double potencia(double base, int expoente){
        double resultado = 1;
        for(int i = 0; i < expoente; i++){
            resultado *= base;
        }
        return resultado;
    }

    public static long fatorial(int n){
        long resultado = 1;
        for(int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }

    public static double calcular(double graus){
        double cosseno = 0;
        int numTermos = 10;

        for(int n = 0; n < numTermos; n++){
            double termo = potencia(graus, 2 * n) / fatorial(2 * n);
            if(n % 2 == 1){
                cosseno -= termo;
            }else{
                cosseno += termo;
            }
        }
        return cosseno;
    }
}

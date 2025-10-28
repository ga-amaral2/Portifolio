package operacoes;

public class Potencia {
    public static double calcular(double base, int expoente){
        double resultado = 1;
        for(int i = 0; i < expoente; i++){
            resultado *= base;
        }
        return resultado;
    }
}

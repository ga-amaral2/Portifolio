package operacoes;

public class Divisao {
    public static double calcular(double num1, double num2){
        if(num2 == 0){
            throw new IllegalArgumentException("ERRO: divisão por Zero");
        }
        return num1 / num2;
    }
}

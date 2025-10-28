package operacoes;

public class Seno {
    public static double calcular(double anguloEmRadianos){
        double resultado = 0.0;
        double termo = anguloEmRadianos;
        int n = 1;
        double precisao = 1e-9;

        while(Math.abs(termo) > precisao){
            resultado += termo;

            termo = termo * (-1) * anguloEmRadianos * anguloEmRadianos / ((n + 1) * (n + 2));
            n += 2;
        }
        return resultado;
    }
}

package operacoes;
public class Tangente {
 public static double calcular(double graus){
    double seno = Seno.calcular(graus);
    double cosseno = Cosseno.calcular(graus);
    return seno / cosseno;
 }
}

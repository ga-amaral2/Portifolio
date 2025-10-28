
/**
 *
 * @author Gabriel Amaral
 */

import java.util.Scanner;
import operacoes.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // menu de escolha, variavel inicializa no -1 para manter o loop
        int opcao = -1;

        do {
            System.out.println("=== Calculadora Científica ===");
            System.out.println("Escolha a operação:");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Potência");
            System.out.println("[6] Raiz quadrada");
            System.out.println("[7] Seno");
            System.out.println("[8] Cosseno");
            System.out.println("[9] Tangente");
            System.out.println("[0] Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando calculadora...");
                break;
            }

            double num1 = 0.0;
            double num2 = 0.0;
            double resultado = 0.0;

            // Entradas
            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();
            } else if (opcao >= 6 && opcao <= 9) {
                System.out.print("Digite um número ou ângulo em graus: ");
                num1 = sc.nextDouble();
            } else {
                System.out.println("Opção inválida!");
                continue;
            }

            switch (opcao) {
                case 1 ->
                    resultado = Soma.calcular(num1, num2);
                case 2 ->
                    resultado = Subtracao.calcular(num1, num2);
                case 3 ->
                    resultado = Multiplicacao.calcular(num1, num2);
                case 4 ->
                    resultado = Divisao.calcular(num1, num2);
                case 5 ->
                    resultado = Potencia.calcular(num1, (int) num2);
                case 6 ->
                    resultado = Raiz.calcular(num1);
                case 7 ->
                    resultado = Seno.calcular(grausParaRadianos(num1));
                case 8 ->
                    resultado = Cosseno.calcular(grausParaRadianos(num1));
                case 9 ->
                    resultado = Tangente.calcular(grausParaRadianos(num1));
            }

            System.out.println("Resultado: " + resultado);
            System.out.println();

        } while (opcao != 0);

        sc.close();
    }

    public static double grausParaRadianos(double graus) {
        return Math.toRadians(graus);
    }
}

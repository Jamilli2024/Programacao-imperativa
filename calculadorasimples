package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
            scanner.close();
            return; // Encerra o programa se houver erro na entrada
        }

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        String divisao = num2 != 0 ? String.valueOf((double) num1 / num2) : "Divisão por zero não permitida";

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}

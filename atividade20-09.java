package app;

import java.util.Arrays;
import java.util.Scanner;

public class VetorOrdenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];

        // Solicitar 10 valores ao usuário
        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            valores[i] = scanner.nextInt();
        }

        // Verificar se o vetor está ordenado
        boolean ordenado = isOrdenado(valores);
        if (ordenado) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }

        // Laço para busca
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o elemento a ser encontrado: ");
            int elemento = scanner.nextInt();
            int posicao;

            if (ordenado) {
                posicao = buscaBinaria(valores, elemento);
            } else {
                posicao = buscaSimples(valores, elemento);
            }

            if (posicao != -1) {
                System.out.println("Elemento encontrado na posição: " + posicao);
            } else {
                System.out.println("Elemento não encontrado.");
            }

            System.out.print("Deseja continuar a busca? (s/n): ");
            char resposta = scanner.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');
        }

        scanner.close();
    }

    // Método para verificar se o vetor está ordenado
    private static boolean isOrdenado(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Busca simples
    private static int buscaSimples(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i; // Retorna a posição
            }
        }
        return -1; // Retorna -1 se não encontrado
    }

    // Busca binária
    private static int buscaBinaria(int[] vetor, int elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == elemento) {
                return meio; // Retorna a posição
            } else if (vetor[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1; // Retorna -1 se não encontrado
    }
}

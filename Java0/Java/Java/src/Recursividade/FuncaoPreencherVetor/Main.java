package FuncaoPreencherVetor;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        //Inserção do tamanho do vetor
        System.out.println("Insira a quantidade de números que serão inseridos dentro do vetor");
        //Criação do Vetor
        int[] vetor = new int[scanner.nextInt()];

        adicionarAoVetor(vetor , i, scanner);

        System.out.println();
        System.out.println("Valores do vetor");
        mostrarNumeros(vetor, i);

    }

    //Função recursiva que adiciona os valores inteiros do vetor
    public static int adicionarAoVetor(int[] vetor, int i, Scanner scanner) {
        if (i<vetor.length) {
            System.out.println("Insira um valor inteiro para a posição "+ i);
            vetor[i] = scanner.nextInt();
            return adicionarAoVetor(vetor,i+1, scanner);
        } else {
            return 0;
        }
    }

    //Função recursiva que mostra todos os números que estão dentro do vetor
    public static int mostrarNumeros(int[] vetor, int i) {
        if (i<vetor.length) {
            System.out.print(vetor[i]+" ");
            return mostrarNumeros(vetor, i+1);
        } else {
            return 0;
        }
    }
}

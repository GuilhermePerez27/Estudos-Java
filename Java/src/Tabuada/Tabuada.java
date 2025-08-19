package Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        System.out.print("Insira um número para saber sua tabuada: ");
        n = scanner.nextDouble();

        System.out.println("Esta é a tabuada de 1 a 10 separadas por espaços");
        for (int i = 1; i<=10; i++) {
            System.out.print(n*i + " ");
        }

    }
}

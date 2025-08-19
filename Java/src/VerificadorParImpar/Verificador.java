package VerificadorParImpar;

import java.util.Scanner;
public class Verificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Insira um número para verificar se ele é par ou ímpar: ");
        n = scanner.nextInt();

        verificador(n);
    }
    public static void verificador(int n){
        if (n%2 == 0) {
            System.out.println("Seu número é par");
        }else {
            System.out.println("Seu número é ímpar");
        }
    }


}

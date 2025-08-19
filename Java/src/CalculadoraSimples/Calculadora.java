package CalculadoraSimples;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        String opc;

        System.out.print("Insira o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.print("Insira o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("O que deseja Realizar");
        System.out.println("+ --> Adição");
        System.out.println("- --> Subtração");
        System.out.println("/ --> Divisão");
        System.out.println("x --> Multiplicação");
        System.out.println();
        opc = scanner.next();

        switch (opc) {
            case "+":
                System.out.println(adicao(n1, n2));
                break;
            case "-":
                System.out.println(subtracao(n1, n2));
                break;
            case "/":
                System.out.println(divisao(n1, n2));
                break;
            case "x":
                System.out.println(multiplicar(n1, n2));
                break;
        }

    }




    public static double adicao(double n1, double n2) {
        return n1+n2;
    }

    public static double subtracao(double n1, double n2) {
        return n1-n2;
    }

    public static double divisao(double n1, double n2) {
        return n1/n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1*n2;
    }
}

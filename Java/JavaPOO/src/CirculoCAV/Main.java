package CirculoCAV;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Insira o valor do Raio: ");
        circulo.raio = scanner.nextDouble();

        System.out.println();

        System.out.println("Valor de Pi: "+ Math.PI);
        System.out.printf("Este é o Valor da circunferência que têm raio "+circulo.raio+": %.2f cm/m", circulo.calcularCircunferencia());
        System.out.println();
        System.out.printf("Este é o valor da área de um círculo com raio "+circulo.raio+": %.2f cm²/m²", circulo.calcularArea());
        System.out.println();
        System.out.printf("Este é o valor do volume de uma esfera com raio "+circulo.raio+": %.2f cm³/m³", circulo.calcularVolume());

        scanner.close();
    }
}
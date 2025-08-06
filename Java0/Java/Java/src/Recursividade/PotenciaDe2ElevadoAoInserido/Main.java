package PotenciaDe2ElevadoAoInserido;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double potencia = 1;
        int cont = 1;
        System.out.println("Insira o número inteiro para descobrir o valor da potencía de 2 elevado ao valor indicado: ");
        n = scanner.nextInt();

        System.out.println("O valor da potência de 2 a este valor é igual a "+potenciaDeDois(n, cont, potencia));

    }

    public static double potenciaDeDois(int n, int cont, double potencia) {
        if (cont <= n) {
            potencia*=2;
            return potenciaDeDois(n, cont+1, potencia);
        } else {
            return potencia;
        }
    }
}

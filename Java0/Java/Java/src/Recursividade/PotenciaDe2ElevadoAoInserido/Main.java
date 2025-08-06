package PotenciaDe2ElevadoAoInserido;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double potencia = 1;
        int cont = 1;
        System.out.println("Insira o número Natural para descobrir o valor da potencía de 2 elevado ao valor indicado: ");
        n = scanner.nextInt();

        //Verificador de natural e 2 elevado ao número indicado
        System.out.println("O valor da potência de 2 a este valor é igual a "+potenciaDeDois(verificarNatural(n, scanner), cont, potencia));

    }

    //Potência de 2 ao número natural indicado
    public static double potenciaDeDois(int n, int cont, double potencia) {
        if (cont <= n) {
            potencia*=2;
            return potenciaDeDois(n, cont+1, potencia);
        } else {
            return potencia;
        }
    }

    public static int verificarNatural(int n, Scanner scanner) {
        if (n < 0) {
            do {
                System.out.println("Número inválido insira um número natural: ");
                n = scanner.nextInt();
            } while(n<0);
            return n;
        } else {
            return n;
        }
    }

}

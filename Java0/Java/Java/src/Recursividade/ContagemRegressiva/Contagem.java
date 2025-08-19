package ContagemRegressiva;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Insira um número para contarmos regressivamente deste número até 0");
        n = scanner.nextInt();

        for (int i = verificadordeNegativo(n, scanner); i>=0; i--) {
            System.out.println(i);
        }
    }

    public static int verificadordeNegativo(int n, Scanner scanner) {
        if (n < 0) {
                System.out.print("Números negativos não serão aceitados, insira um número inteiro positivo: ");
                n = scanner.nextInt();
                return verificadordeNegativo(n, scanner);
        } else {
            return n;
        }
    }
}

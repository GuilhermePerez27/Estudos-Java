import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;
        System.out.println("Insira um número natural:");
        n = scanner.nextInt();
        //Soma de todos os números de 0 até o número indicado
        System.out.println("Soma de todos os números do 0 ao indicado: "+somaNatural(verificarNatural(n, scanner), soma));
    }


    //Função somar números naturais
    public static int somaNatural(int n, int soma) {
        if (n < 0) {
            return soma;
        } else {
            soma += n;
            return somaNatural(n - 1, soma);
        }
    }

    // Verificador se o número digitado é um número natural
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
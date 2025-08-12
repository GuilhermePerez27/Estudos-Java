package MoldarPalavra;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Atributos
        Palavra palavra = new Palavra();
        Scanner sc = new Scanner(System.in);
        String opc;

        //insrir palavra
        System.out.print("Insira uma palavra qualquer: ");
        palavra.palavra = sc.next();

        do {
            System.out.println("===============================================");
            System.out.println("Inverter - Mostra a palavra ivertida");
            System.out.println("ContarV - Conta as vogais da palavra");
            System.out.println("ContarC - Conta as consoantes da palavra");
            System.out.println("Adição  - Adiciona outras palavras criando uma frase ");
            System.out.println("Parar   - Encerra o programa...");
            System.out.println("===============================================");
            opc = sc.next();

            //Input errado == encerrar programa
            if (!opc.equals("ContarV") && !opc.equals("ContarC") && !opc.equals("Adição") && !opc.equals("Parar") && !opc.equals("Inverter") ) {
                System.out.println("Opção inválida programa encerrando....");
                break;
            }
            
                switch (opc) {
                    case "Inverter":
                        System.out.println("Esta é sua palavra escolhida: "+ palavra.palavra);
                        System.out.println("Esta é sua palavra invertida: "+ palavra.iverterPalavra());
                        break;

                    case "ContarV":
                        System.out.println("Esta é a quantidade de vogais na sua palavra/frase: "+ palavra.contarVogais());
                        break;

                    case "ContarC":
                        System.out.println("Esta é a quantidade de consoantes na sua palavra/frase: "+palavra.contarConsoantes());
                        break;

                    case "Adição":
                        String add;
                        System.out.println("Qual palavra deseja adicionar");
                        add = sc.next();
                        palavra.adicionarPalavras(add);
                        System.out.println("Nova frase criada: ("+palavra.palavra+")");
                        break;
                }
        } while (!opc.equals("Parar"));

    }
}

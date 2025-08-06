package ProdutoAddRemoveValorETotal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome do produto: ");
        produto.setNome(sc.next());
        System.out.print("Preço do produto: ");
        produto.setPreco(sc.nextDouble());
        System.out.print("Quantidade do produto: ");
        produto.setQuantidade(sc.nextInt());
        System.out.println("----------------------------------------------");
        System.out.println("Dados do produto: ");
        System.out.println(produto);
    }
}

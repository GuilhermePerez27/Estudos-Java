package PessoaFuncionario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Variável opção
        int opc;

        //Atribuição de dados do funcionário
        //==================================================================================================
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Insira o nome do Funcionario: ");
        funcionario.nome = scanner.next();

        System.out.print("Insira a idade de "+ funcionario.nome+": ");
        funcionario.idade = scanner.nextInt();

        System.out.println();
        funcionario.apresentar();
        System.out.println();

        System.out.print("Insira o cargo de "+funcionario.nome+": ");
        funcionario.cargo = scanner.next();

        System.out.print("Insira o Salário de "+funcionario.nome+": ");
        funcionario.setSalario(scanner.nextDouble());
        //==================================================================================================


        //Funcionalidades
        //==================================================================================================
        //0 - apresentação do funcionário
        //1 - Timer de tempo trabalhando
        //2 , 3 - Aumento de Salário e Redução de Salário
        //==================================================================================================
        do {
            System.out.println();
            System.out.println("========================================");
            System.out.println("0 - Apresentrar Funcionário");
            System.out.println("1 - Iniciar Trabalho");
            System.out.println("2 - Aumentar Salário");
            System.out.println("3 - Reduzir Salário");
            System.out.println("4 - Parar programa");
            System.out.println("========================================");
            opc = scanner.nextInt();

            //Caso número inválido encerramento de programa
            if (opc>=5 || opc <0) {
                System.out.println("Número inválido... parando programa");
                break;
            }

            switch (opc) {
                case 0:
                    System.out.println(funcionario.toString());;
                    break;

                case 1:
                    funcionario.trabalhar(scanner);
                    break;

                case 2:
                    System.out.print("Insira o percentual de aumento de salário de "+funcionario.nome+": ");
                    double percentualAumento = scanner.nextDouble();
                    funcionario.reduzirSalario(verificaPercentual(percentualAumento, scanner));
                    break;

                case 3:
                    System.out.print("Insira o percentual de redução de salário de "+funcionario.nome+": ");
                    double percentualReducao = scanner.nextDouble();
                    funcionario.reduzirSalario(verificaPercentual(percentualReducao, scanner));
                    break;
            }

        } while(opc != 4);
        //==================================================================================================
    }

    //Verificador de percentual caso o percentual for negativo
    public static double verificaPercentual(double percentual, Scanner scanner) {
            if (percentual <= 0) {
                do {
                    System.out.println("Percentual nulo ou negativo não será permitido insira um número válido");
                    percentual = scanner.nextDouble();
                } while (percentual<=0);
            }
            return percentual;
    }


}
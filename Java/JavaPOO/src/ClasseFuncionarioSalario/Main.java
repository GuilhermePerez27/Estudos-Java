package ClasseFuncionarioSalario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double porcentagemAumento;

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        //Inserção de dados
        System.out.println("Insira as informações do funcionário");
        System.out.println("Nome: ");
        funcionario.setNome(scanner.next());
        System.out.println("Salário: ");
        funcionario.setSalario(scanner.nextDouble());
        System.out.println("Insira o valor do Imposto (1 - 100 --> Será considerado em porcentagem) ");
        funcionario.setImposto(scanner.nextDouble());

        //Aumento do salário bruto
        System.out.println("Insira o valor em porcentagem do aumento do salário");
        porcentagemAumento = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagemAumento);

        //Salário após os imposto
        System.out.println("Este é o salário com o imposto");
        System.out.println("R$ "+funcionario.novoSalario());

        //Status do funcionário
        funcionario.statusFuncionario();


    }
}

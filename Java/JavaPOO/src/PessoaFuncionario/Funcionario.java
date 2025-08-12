package PessoaFuncionario;
import java.util.Scanner;
public class Funcionario extends Pessoa {
    public String cargo;
    private double salario;


    //Método de trabalhar
    public void trabalhar(Scanner scanner) {
        String parar;
        System.out.println("Eu "+nome+" estou tabalhando");

        //long tempoInicial faz um markpoint onde marca este exato momento em ms
        long tempoInicial = System.currentTimeMillis();

        //Sistema de Parar o trabalho
        do {
            System.out.print("Digite 'Sim' para encerrar o trabalho de "+nome+": ");
            parar = scanner.next();
        } while (!parar.equals("Sim"));

        //long tempoFinal também é um markpoint que marca este exato momento em ms
        long tempoFinal = System.currentTimeMillis();

        //long tempoDecorrido resgata os dois markpoints Inicial e Final e calcula o tempo entre eles em segundos
        long tempoDecorrido = (tempoFinal - tempoInicial)/1000;

        System.out.println();
        System.out.println(nome+" trabalhou por "+tempoDecorrido+"s");
    }

    //Código de aumento de Salário
    public void aumentarSalario(double percentual) {
        System.out.println("Salário Antigo: "+getSalario());
        setSalario(getSalario() + (getSalario()*(percentual/100)));
        System.out.println("Salário Atual: "+getSalario());
    }

    //Código de  redução de Salário
    public void reduzirSalario(double percentual) {
        System.out.println("Salário Antigo: "+getSalario());
        setSalario(getSalario() - (getSalario()*(percentual/100)));
        System.out.println("Salário Atual: "+getSalario());
    }

    // Informações do funcionário
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nCargo: " + cargo +
                "\nSalário Atual: "+ getSalario()
                ;
    }



    // ===================================Setter e Getter=============================================
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    // ===================================Setter e Getter=============================================
}

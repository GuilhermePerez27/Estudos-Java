package ClasseFuncionarioSalario;
public class Funcionario {
    private String nome;
    private double salario;
    private double imposto;

    //Método de salário após o imposto
    public double novoSalario() {
        setSalario(getSalario() - (getSalario() * (getImposto()/100)));
        return getSalario();
    }

    //Método de aumento de salário
    public void aumentarSalario(double porcentagem) {
        setSalario(getSalario()*(1+(porcentagem/100)));
        System.out.println("O novo salário agora é de "+getSalario());
    }

    //Status do Funcionário
    public void statusFuncionario() {
        System.out.println("Dados do funcionário");
        System.out.println("-----------------------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Salário líquido: "+getSalario());
    }

    //====================================================================

    // Encapsulamento


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getImposto() {
        return imposto;
    }

    public double getSalario() {
        return salario;
    }
}

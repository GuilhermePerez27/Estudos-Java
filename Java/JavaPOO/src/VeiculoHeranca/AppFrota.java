package VeiculoHeranca;

public class AppFrota {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fos", "Robertinho carros", 1890);
        System.out.println(veiculo1.exibirInformacoes());

        System.out.println();

        Veiculo veiculo2 = new Veiculo("Renault", "Kwid");
        System.out.println(veiculo2.exibirInformacoes());

        System.out.println();

        Moto moto1 = new Moto("Kawassaki", "Z650", 2021, 600);
        System.out.println(moto1.exibirInformacoes());

        System.out.println();

        Caminhao caminhao1 = new Caminhao("Scania Super", "Scania", 2015, 100, 15);
        System.out.println(caminhao1.exibirInformacoes());


    }
}
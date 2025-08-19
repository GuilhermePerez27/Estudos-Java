package VeiculoHeranca;

public class Veiculo {
    String modelo;
    String marca;
    int ano;

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = 2020;
    }

    public String exibirInformacoes() {
        return ("Modelo: "+ modelo +
                "\nMarca: "+ marca +
                "\nAno: "+ ano);
    }

}

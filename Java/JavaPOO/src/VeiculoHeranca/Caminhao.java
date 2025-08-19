package VeiculoHeranca;

public class Caminhao extends Veiculo{
    double capacidadeDeCarga;
    int quantidadeDeEixos;

    public Caminhao (String modelo, String marca, int ano, double capacidadeDeCarga, int quantidadeDeEixos) {
        super(modelo, marca, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + "\nCapacidade de Carga: "+ capacidadeDeCarga + "Ton" + "\nQuantidade de Eixos: "+ quantidadeDeEixos;
    }
}

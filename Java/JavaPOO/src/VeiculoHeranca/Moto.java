package VeiculoHeranca;

public class Moto extends Veiculo{
    int cilindradas;


    public Moto(String modelo, String marca, int ano, int cilindradas) {
        super(modelo, marca, ano);
        this.cilindradas = cilindradas;
    }
    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + "\nCilindradas: "+ cilindradas;
    }
}

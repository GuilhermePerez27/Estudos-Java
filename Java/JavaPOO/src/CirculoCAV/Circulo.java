package CirculoCAV;

public class Circulo {
    double raio;

    public double calcularCircunferencia() {
        return(2 * Math.PI * raio);
    }

    public double  calcularVolume() {
        return (Math.pow(raio, 3) * 4/3 * Math.PI );
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}

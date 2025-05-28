package Ejercicio_8_3.Figuras;

public class Cilindro extends Figuras {
    private double radio;
    private double altura;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
        setSuperficie(calcularSuperficie());
        setVolumen(calcularVolumen());
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularSuperficie() {
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
    }
}

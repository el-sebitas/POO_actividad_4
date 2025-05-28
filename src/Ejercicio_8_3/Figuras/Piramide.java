package Ejercicio_8_3.Figuras;

public class Piramide extends Figuras {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double altura, double apotema, double base) {
        this.altura = altura;
        this.apotema = apotema;
        this.base = base;
        setSuperficie(calcularSuperficie());
        setVolumen(calcularVolumen());
    }

    public double calcularSuperficie() {
        return Math.pow(base, 2) + 2 * base * apotema;
    }

    public double calcularVolumen() {
        return (Math.pow(base, 2) * altura) / 3;
    }
}

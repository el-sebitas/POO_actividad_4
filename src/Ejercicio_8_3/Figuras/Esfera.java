package Ejercicio_8_3.Figuras;

public class Esfera extends Figuras {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        setSuperficie(calcularSuperficie());
        setVolumen(calcularVolumen());
    }

    public double calcularVolumen() {
        return ((double) 4 /3) * Math.PI * Math.pow(radio, 3);
    }

    public double calcularSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}

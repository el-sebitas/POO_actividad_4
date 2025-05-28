package Ejercicio_8_2;

import java.util.ArrayList;
import java.util.Collections;

public class Notas {
    private ArrayList<Double> notas = new ArrayList<>();

    public void ingresarNota(double nota) {
        notas.add(nota);
    }

    public double promedio() {
        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        return total / notas.size();
    }

    public double mayorNota() {
        ArrayList<Double> notas = this.notas;
        Collections.sort(notas);
        return notas.get(notas.size() - 1);
    }

    public double menorNota() {
        ArrayList<Double> notas = this.notas;
        Collections.sort(notas);
        return notas.get(0);
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (double nota: notas) {
            suma = Math.pow(nota, 2);
        }
        return Math.sqrt(suma);
    }
}

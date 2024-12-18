package Ejercicio_7;

public class Comparacion {
    private double A, B;

    public Comparacion(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public String comparar() {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
}

package Ejercicio_7;

import java.util.Scanner;

public class main_Comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        Comparacion comparacion = new Comparacion(A, B);
        String resultado = comparacion.comparar();

        System.out.println("\nResultado de la comparacion:");
        System.out.println(resultado);
    }
}

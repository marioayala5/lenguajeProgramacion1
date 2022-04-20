//ALUMNOS: Carlos Chiriani y Mario Ayala
//MATERIA: BD1
package unidad5;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        int triangulo;
        double lado1, lado2, resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nIngrese la cantidad de triangulos a calcular su hipotenusa: ");
        triangulo = entrada.nextInt();

        for (int ctriangulo = 1; ctriangulo <= triangulo; ctriangulo++) {
            System.out.printf("\nTriangulo %s", ctriangulo + "\n*********\n");
            System.out.print("Longitud lado 1: ");
            lado1 = entrada.nextInt();
            System.out.print("Longitud lado 2: ");
            lado2 = entrada.nextInt();
            
            resultado = hipotenusa(lado1, lado2);
            System.out.printf(" Hipotenusa del triangulo %.2f\n", resultado);
        }
    }

    public static double hipotenusa(double a, double b) {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hipotenusa;
    }
}

package unidad5;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantTriangulo, i;
        double lado1, lado2, resultado;
        i = 1;

        System.out.print("Ingrese la cantidad de triangulos para calcular la hipotenusa: ");
        cantTriangulo = input.nextInt();

        while (i <= cantTriangulo) {
            System.out.printf("Triangulo %d\n**********\n", i++);
            System.out.print("Escriba la longitud del lado 1: ");
            lado1 = input.nextDouble();
            System.out.print("\nEscriba la longitud del lado 2: ");
            lado2 = input.nextDouble();
            
            resultado = hipotenusa(lado1, lado2);
            System.out.println("La hipotenusa del triangulo es: " + resultado);
        }
    }

    public static double hipotenusa(double lado1, double lado2) {
        double hipo = (Math.pow(lado1, 2)+Math.pow(lado2, 2));
        double resul = Math.sqrt(hipo);
        return hipo;
    }
}

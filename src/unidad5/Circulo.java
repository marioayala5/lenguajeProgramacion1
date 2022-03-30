package unidad5;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantCirulo;
        int i = 1;
        System.out.print("Ingrese la cantidad de circulos para calcular su area: ");
        cantCirulo = input.nextInt();
        
        while (i <= cantCirulo) {            
            double r;
            double areaCirculo;
            double periCirculo;
            
            System.out.printf("\nEscriba el radio del circulo %d: ", i);
            r = input.nextInt();
            areaCirculo = Math.PI*(r*r);
            System.out.printf("El area del circulo %d: %.2f\n", i, areaCirculo);
            periCirculo = 2*Math.PI*r;
            System.out.printf("El perimero del circulo %d: %.2f\n", i++, periCirculo);
        }
        System.out.println("GRACIAS!");
    }
}

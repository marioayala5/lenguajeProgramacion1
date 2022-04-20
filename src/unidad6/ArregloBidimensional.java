package unidad6;

import java.util.Scanner;

public class ArregloBidimensional {

    public static void main(String[] args) {
        int[][] arreglo = new int[3][4];
        int[] arreglo1 = new int[5];
        int nro, a, b, sumaf, sumac;
        a = 0;
        sumac = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los datos para el arreglo bidimensional 3 filas y 4 columnas");
        for (int f = 0; f < arreglo.length; f++) {
            System.out.printf("FILA %d\n", ++a);
            b = 0;
            for (int c = 0; c < arreglo[f].length; c++) {
                System.out.printf("Columna %d => ", ++b);
                arreglo[f][c] = scan.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Arreglo bidimensional de 4 x 5");
        for (int f = 0; f < arreglo.length; f++) {
            sumaf = 0;
            for (int c = 0; c < arreglo[f].length; c++) {
                arreglo1[c] += arreglo[f][c];
                sumaf += arreglo[f][c];
                System.out.printf("%5d", arreglo[f][c]);
            }
            System.out.printf("   %d", sumaf);
            sumac += sumaf;
            arreglo1[4] = sumac;
            System.out.println("");
        }
        for (int i : arreglo1) {
            System.out.printf("%5d", i);
        }
        System.out.println("");
    }
}

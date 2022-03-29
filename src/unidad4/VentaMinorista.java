package unidad4;

import java.util.Scanner;

public class VentaMinorista {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double producto1 = 2.98;
        double producto2 = 4.50;
        double producto3 = 9.98;
        double producto4 = 4.49;
        double producto5 = 6.87;

        double proTotal1, proTotal2, proTotal3, proTota14, proTotal5;
        proTotal1 = 0.0;
        proTotal2 = 0.0;
        proTotal3 = 0.0;
        proTota14 = 0.0;
        proTotal5 = 0.0;

        Integer nroProducto, cantProducto; //Numero del producto y Cantidad Vendida

        nroProducto = 0;
        cantProducto = 0;

        System.out.print("Escriba numero de producto (1 - 5) o -99 para finalizar: ");
        nroProducto = scan.nextInt();
        if (nroProducto == -99) {
            System.out.println("No se realizo ninguna carga");
        } else {
            while (nroProducto != -99) {
                if (nroProducto > 0 && nroProducto <= 5) {
                    System.out.printf("Escriba cantidad vendida del producto %d: ", nroProducto);
                    cantProducto = scan.nextInt();
                    switch (nroProducto) {
                        case 1 -> proTotal1 += (producto1 * cantProducto); 
                        case 2 -> proTotal2 += (producto2 * cantProducto);
                        case 3 -> proTotal3 += (producto3 * cantProducto);
                        case 4 -> proTota14 += (producto4 * cantProducto);
                        case 5 -> proTotal5 += (producto5 * cantProducto);
                    }
                    System.out.print("Escriba numero de producto (1 - 5) o -99 para finalizar: ");
                    nroProducto = scan.nextInt();
                } else {
                    System.out.println("Numero de producto incorrecto");
                    System.out.print("Escriba numero de producto (1 - 5) o -99 para finalizar: ");
                    nroProducto = scan.nextInt();
                }
            }
        }
        System.out.print("\nReporte de Ventas\n*****************\n");
        System.out.printf("El total de ventas del producto 1 es %.2f\n", proTotal1);
        System.out.printf("El total de ventas del producto 2 es %.2f\n", proTotal2);
        System.out.printf("El total de ventas del producto 3 es %.2f\n", proTotal3);
        System.out.printf("El total de ventas del producto 4 es %.2f\n", proTota14);
        System.out.printf("El total de ventas del producto 5 es %.2f\n", proTotal5);
    }
}

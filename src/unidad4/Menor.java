package unidad4;

import java.util.Scanner;

public class Menor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro, i, menor, nroMenor;
        i = 1;
        nroMenor = 0;

        System.out.print("Escriba la cantidad de valores que desea introducir: ");
        nro = scan.nextInt();

        while (i <= nro) {
            System.out.printf("Introduzca numero de la iteracion %d: ", i++);
            menor = scan.nextInt();
            while (menor <= nroMenor) {
                nroMenor = menor;
                break;
            }
        }
        System.out.printf("El numero menor entre los %d valores introducidos es %d\n", nro, nroMenor);
    }

}

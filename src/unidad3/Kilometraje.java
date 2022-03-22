package unidad3;

import java.util.Scanner;

public class Kilometraje {

    public void RegistroKilometraje() {
        int km, litro, litroAcumulado, viaje, kmAcumulado;
        double kmporlitro;
        kmAcumulado = 0;
        litroAcumulado = 0;
        viaje = 1;
        
        Scanner input = new Scanner(System.in);

        System.out.printf("Ingrese km en viaje %d o -99 para terminar: ", viaje);
        km = input.nextInt();
        if (km == -99) {
            System.out.println("No realizó ningun kilometraje");
        } else {
            while (km != -99) {
                kmAcumulado = kmAcumulado + km;
                System.out.printf("Ingrese litros en viaje %d: ", viaje);
                litro = input.nextInt();
                litroAcumulado = litroAcumulado + litro;
                kmporlitro = km / litro;
                System.out.printf("Kilometros por litros realizados en el viaje %d es: %.2f\n\n", viaje, kmporlitro);
                viaje++;
                System.out.printf("Ingrese km en viaje %d o -99 para terminar: ", viaje);
                km = input.nextInt();
            }
            System.out.printf("\nTotal de km realizado en %d viajes es: %d\n", viaje - 1, kmAcumulado);
            System.out.printf("Total litros realizado en %d viajes es: %d\n", viaje - 1, litroAcumulado);
            kmporlitro = kmAcumulado / litroAcumulado;
            System.out.printf("Kilometros por litros realizado en %d viajes es: %.2f\n", viaje - 1, kmporlitro);
        }
    }
}

package unidad5;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int opt = 1;

        while (opt == 1) {
            int nroUsuario = 0;
            System.out.println("Adivine un numero del 1 al 20: ");
            nroUsuario = input.nextInt();
            int nroAdivinanza = random.nextInt(20);
            System.out.printf("%d\n", nroAdivinanza);
            while (nroUsuario != nroAdivinanza) {
                if (nroUsuario > nroAdivinanza) {
                    System.out.printf("%d demasiado alto. Intente de nuevo\n", nroUsuario);
                } else if (nroUsuario < nroAdivinanza) {
                    System.out.printf("%d demasiado bajo. Intente de nuevo\n", nroUsuario);
                }
                System.out.println("Adivine un numero del 1 al 20: ");
                nroUsuario = input.nextInt();
            }
            System.out.println("Felicidades. Adivino el numero!");
            System.out.println("Desea jugar otra vez? 1 = SI / 2 = NO");
            opt = input.nextInt();
        }
        System.out.println("GRACIAS POR JUGAR");
    }
}

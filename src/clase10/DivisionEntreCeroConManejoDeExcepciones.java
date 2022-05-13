package clase10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEntreCeroConManejoDeExcepciones {

    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuarCiclo = true;

        do {
            try {
                System.out.println("Introduzca un numerador entero: ");
                int numerador = scan.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = scan.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);

                continuarCiclo = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nExcepcion: %s", inputMismatchException);
                scan.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("\nExcepcion: %s", arithmeticException);
                System.out.println("Cero es un denominador invalido. Intente de nuevo");
            }

        } while (continuarCiclo);
    }
}

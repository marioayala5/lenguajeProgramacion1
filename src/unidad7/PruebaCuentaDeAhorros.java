package unidad7;

import java.util.Scanner;

public class PruebaCuentaDeAhorros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in;

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        System.out.printf("Saldo inicial del ahorrador 1 es %.2f\n", ahorrador1.getSaldoAhorros());
        System.out.printf("Saldo inicial del ahorrador 2 es %.2f\n", ahorrador2.getSaldoAhorros());

        System.out.println("\nAhorrador 1");
        for (int i = 1; i < 13; i++) {
            double saldo = ahorrador1.getSaldoAhorros();
            double interes = ahorrador1.calcularInteresMensual();
            double suma = saldo + interes;
            System.out.printf("Mes %d -> %.2f + %.2f = %.2f\n", i, saldo, interes, suma);
            ahorrador1.setSaldoAhorros(suma);
        }

        System.out.println("\nAhorrador 2");
        for (int i = 1; i < 13; i++) {
            double saldo = ahorrador2.getSaldoAhorros();
            double interes = ahorrador2.calcularInteresMensual();
            double suma = saldo + interes;
            System.out.printf("Mes %d -> %.2f + %.2f = %.2f\n", i, saldo, interes, suma);
            ahorrador2.setSaldoAhorros(suma);
        }

        System.out.printf("\nIngrese el interes con que desea calcular: ");
        in = scan.nextInt();
        System.out.println("\nAhorrador 1");
        for (int i = 1; i < 13; i++) {
            double saldo = ahorrador1.getSaldoAhorros();
            double interes = ahorrador1.modificarTasaInteres(ahorrador1.getSaldoAhorros(), in);
            double suma = saldo + interes;
            System.out.printf("Mes %d -> %.2f + %.2f = %.2f\n", i, saldo, interes, suma);
            ahorrador1.setSaldoAhorros(suma);
        }

        System.out.println("\nAhorrador 2");
        for (int i = 1; i < 13; i++) {
            double saldo = ahorrador2.getSaldoAhorros();
            double interes = ahorrador2.modificarTasaInteres(ahorrador2.getSaldoAhorros(), in);
            double suma = saldo + interes;
            System.out.printf("Mes %d -> %.2f + %.2f = %.2f\n", i, saldo, interes, suma);
            ahorrador2.setSaldoAhorros(suma);
        }
    }
}

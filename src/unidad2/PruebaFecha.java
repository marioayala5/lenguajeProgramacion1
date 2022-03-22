package unidad2;

import java.util.Scanner;

public class PruebaFecha {

    public static void main(String[] args) {
        int dia, mes, anho;
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba el dia: ");
        dia = input.nextInt();
        System.out.print("Escriba el mes: ");
        mes = input.nextInt();
        System.out.print("Escriba el año ");
        anho = input.nextInt();

        Fecha fec = new Fecha(dia, mes, anho);
        fec.FormatoFecha();
    }

}

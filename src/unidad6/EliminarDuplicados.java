package unidad6;

import java.util.Scanner;

public class EliminarDuplicados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo[] = new int[5];
        boolean resul;
        int nro;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero: ");
            nro = scan.nextInt();
            resul = BuscarDuplicado(nro, arreglo);
            if (resul == true) {
                System.out.println("Numero Duplicado");
                i--;
            } else {
                arreglo[i] = nro;
            }
        }
        
        System.out.println("");
        System.out.println("Numeros Distintos");
        
        for (int i : arreglo) {
            System.out.printf("%d ", i);
        }

    }

    private static boolean BuscarDuplicado(int elemento, int[] arreglo) {
        boolean valor = true;

        for (int i : arreglo) {
            System.out.println(i);
            if (elemento == i) {
                return valor;
            } else if (elemento != i) {
                valor = false;
                return valor;
            }
        }
        return valor;
    }
}

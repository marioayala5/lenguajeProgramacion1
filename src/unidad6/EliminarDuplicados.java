package unidad6;

import java.util.Scanner;

public class EliminarDuplicados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo[] = new int[5];
        boolean resul = false;
        int nro;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero: ");
            nro = scan.nextInt();
            resul = BuscarDuplicado(nro, arreglo);
            while (resul == true) {
                System.out.println("Numero Duplicado");
                System.out.printf("Introduzca un numero: ");
                nro = scan.nextInt();
                resul = BuscarDuplicado(nro, arreglo);
            }
            arreglo[i] = nro;
            resul = false;
        }

        System.out.println("");
        System.out.println("Numeros Distintos");

        for (int i : arreglo) {
            System.out.printf("%d ", i);
        }

    }

    public static boolean BuscarDuplicado(int elemento, int[] arreglo) {
        boolean band=false;
        int d=0;
        for (int i=0;i<arreglo.length;i++){
            d=arreglo[i];
            if(arreglo[i]!=elemento){
                band=false;
            }else{
                band=true;
                break;
            }       
        }
        return band;
    }
}

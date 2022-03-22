package unidad3;

import java.util.Scanner;

public class Mayor {

    public void valorMayor() {
        int contador, numero, mayor, vendedor;
        contador = 1;
        mayor = 0;
        vendedor = 0;

        Scanner input = new Scanner(System.in);

        while (contador <= 10) {
            System.out.printf("Ingrese cantidad vendida por el vendedor %d: ", contador);
            numero = input.nextInt();
            if (numero > mayor) {
                mayor = numero;
                vendedor = contador;
            }
            contador ++;
        }
        System.out.printf("La mayor cantidad vendida fue %d realizada por el vendedor %d\n", mayor, vendedor);
    }
}

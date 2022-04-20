package unidad6;

import java.util.Random;

public class TirarDado {

    public static void main(String[] args) {
        Random ran = new Random();
        int dado, dado1, suma;
        int arreglo[] = new int[11];

        for (int i = 0; i < 36000000; i++) {
            dado = ran.nextInt(6) + 1;
            dado1 = ran.nextInt(6) + 1;
            suma = dado + dado1;
            
            switch (suma) {
                case 2 -> arreglo[0] += suma;
                case 3 -> arreglo[1] += suma;
                case 4 -> arreglo[2] += suma;
                case 5 -> arreglo[3] += suma;
                case 6 -> arreglo[4] += suma;
                case 7 -> arreglo[5] += suma;
                case 8 -> arreglo[6] += suma;
                case 9 -> arreglo[7] += suma;
                case 10 -> arreglo[8] += suma;
                case 11 -> arreglo[9] += suma;
                case 12 -> arreglo[10] += suma;
            }
        }
        int x = 1;
        for (int i : arreglo) {
            System.out.printf("Suma %d => %d\n", ++x, i);
        }
    }
}

package unidad4;

import java.text.DecimalFormat;
public class ProductoImpar {

    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("#,###");
        long producto = 1;
        for (int i = 1; i < 16; i++) {
            producto *= i;
            i++;
        }
        System.out.printf("El producto entre los enteros impares del 1 al 15 es: %s\n", decimal.format(producto));
    }
}

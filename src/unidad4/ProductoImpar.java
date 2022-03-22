package unidad4;

public class ProductoImpar {

    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i < 16; i++) {
            producto *= i;
            i++;
        }
        System.out.printf("El producto entre los enteros impares del 1 al 15 es: %d\n", producto);
    }
}

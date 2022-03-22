package unidad4;

public class Factorial {

    public static void main(String[] args) {
        long factorial = 1;
        int  f = 1;
        int cont = 1;
        
        do {
            if (cont <= f) {
                factorial *= cont;
                cont++;
            }
            System.out.printf("El factorial de %d es %d\n", f++, factorial);
        } while (f <= 20);
    }
}

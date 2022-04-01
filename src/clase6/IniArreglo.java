package clase6;

public class IniArreglo {

    public static void main(String[] args) {
        int [] arreglo = new int [10];
        
        System.out.printf("%s%8s\n","Indice", "Valor");
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%6d%8d\n", contador, arreglo[contador]);
        }
    }
    
}

package clase6;

public class IniArreglo2 {

    public static void main(String[] args) {
        int [] arreglo = {32,27,64,18,95,14,90,70,60,37,40};
        int total = 0;
        
        for (int contador = 0; contador < arreglo.length; contador++) {
            total += arreglo[contador];
        }
    
            System.out.println("Total de los elementos del arreglo es: " + total);        
    }
}

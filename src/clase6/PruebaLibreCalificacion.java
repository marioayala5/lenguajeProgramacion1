package clase6;

public class PruebaLibreCalificacion {

    public static void main(String[] args) {
        Integer [] arregloCalif = {87,68,94,100,83,78,85,91,76,87};
        
        LibroCalificaciones libCalif = new LibroCalificaciones("Programacion1", arregloCalif);
        libCalif.mostrarMensaje();
        libCalif.procesarCalificaciones();
    }
    
}

package clase6;

public class LibroCalificaciones {
    private String nombreMateria;
    private Integer [] calificaciones;
    
    public LibroCalificaciones (String nombre, Integer [] arregloCalif) {
        nombreMateria = nombre;
        calificaciones = arregloCalif;
    }
    
    public void mostrarMensaje () {
        System.out.printf("Bienvenido al libro de Calificaciones de %s\n", nombreMateria);
    }
    
    public void procesarCalificaciones () {
        imprimirCalificaciones();
        System.out.printf("El promedio de la clase es: %.2f\n", obtenerPromedio());
        System.out.printf("la calificacion mas baja es %d\nLa calificacion mas alta es %d\n\n", 
                obtenerMinima(),obtenerMaxima());
        imprimirGraficoBarras();
    }
    
    public Integer obtenerMinima() {
        Integer califBaja = calificaciones[0];
        for (Integer calificacion : calificaciones) {
            if (calificacion < califBaja) {
                califBaja = calificacion;
            }
        }
        return califBaja;
    }
    
    public Integer obtenerMaxima() {
        Integer califMax = calificaciones[0];
        for (Integer calificacion : calificaciones) {
            if (calificacion > califMax) {
                califMax = calificacion;
            }
        }
        return califMax;
    }
    
    public double obtenerPromedio(){
        Integer total = 0;
        for (Integer calificacion : calificaciones) {
            total += calificacion;
        }
        double prom = total / calificaciones.length;
        return prom;
    }
    
    public void imprimirGraficoBarras(){
        System.out.println("Distribucion de calificaciones: ");
        int [] frecuencia = new int[11];
        
        for (int calificacion : calificaciones) {
            ++frecuencia[calificacion / 10];
        }
        
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            if (cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            }
            
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void imprimirCalificaciones() {
        System.out.println("Las calificaciones son:\n");
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d\n", estudiante + 1, calificaciones[estudiante]);
        }
    }
}

package unidad8;

 public class PruebaHerencia {

    public static void main(String[] args) {
        
        SeleccionFutbol futbol1 = new Futbolista(1, "Mario", "Ayala", 27, 12, 5);
        SeleccionFutbol futbol2 = new Entrenador(1, "Mario", "Ayala", 23, "APF");
        SeleccionFutbol futbol3 = new Masajista(1, "Mario", "Ayala", 27, "Kinesiologo", 5);
        
        System.out.println("Todos los futbolistas comienzan una concentracion.");
        System.out.printf("%s %s %s",futbol1.getNombre(), futbol1.getApellido(), futbol1.concentrarse());
//        System.out.printf("%s %s -> %s",futbol1.getNombre(), futbol2.getApellido(), futbol1.concentrarse() );
//        System.out.printf("%s %s -> %s",futbol1.getNombre(), futbol3.getApellido(), futbol1.concentrarse() );
                
        

    }
}

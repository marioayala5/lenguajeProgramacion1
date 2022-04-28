package unidad8;

 public class PruebaHerencia {

    public static void main(String[] args) {
        
        Futbolista futbol1 = new Futbolista(1, "Derlis", "Gonzalez", 27, 12, 5);
        Entrenador futbol2 = new Entrenador(1, "Julio", "Caceres", 23, "APF");
        Masajista futbol3 = new Masajista(1, "Guillermo", "Ortigoza", 27, "Kinesiologo", 5);
        
        System.out.println("Todos los futbolistas comienzan una concentracion.");
        System.out.printf("%s %s -> ",futbol1.getNombre(), futbol1.getApellido());
        futbol1.concentrarse();
        System.out.printf("%s %s -> ",futbol2.getNombre(), futbol2.getApellido());
        futbol2.concentrarse();
        System.out.printf("%s %s -> ",futbol3.getNombre(), futbol3.getApellido());
        futbol3.concentrarse();
        
        System.out.println("\nTodos los integrantes viajan para jugar un partido.");
        System.out.printf("%s %s -> ",futbol1.getNombre(), futbol1.getApellido());
        futbol1.viajar();
        System.out.printf("%s %s -> ",futbol2.getNombre(), futbol2.getApellido());
        futbol2.viajar();
        System.out.printf("%s %s -> ",futbol3.getNombre(), futbol3.getApellido());
        futbol3.viajar();
        
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar.");
        System.out.printf("%s %s -> ",futbol1.getNombre(), futbol1.getApellido());
        futbol1.entrenar();
        System.out.printf("%s %s -> ",futbol2.getNombre(), futbol2.getApellido());
        futbol2.dirigirEntrenamiento();
                
        System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje.");
        System.out.printf("%s %s -> ",futbol3.getNombre(), futbol3.getApellido());
        futbol3.darMasaje();
        
        System.out.println("\nPartido de Futbol: Solamente el entrenador y el futbolista tiene metodos para el partido de futbol.");
        System.out.printf("%s %s -> ",futbol1.getNombre(), futbol1.getApellido());
        futbol1.jugarPartido();
        System.out.printf("%s %s -> ",futbol2.getNombre(), futbol2.getApellido());
        futbol2.dirigirPartido();
    }
}

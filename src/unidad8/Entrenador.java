package unidad8;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellido, Integer edad, String idFederacion ) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public Entrenador() {
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido() {
        System.out.println("Dirige un partido");
    }
    
    public void dirigirEntrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }
}

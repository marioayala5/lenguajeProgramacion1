package unidad8;

public class Futbolista extends SeleccionFutbol{
    private Integer cantidadGoles;
    private Integer posicion;

    public Futbolista(Integer id, String nombre, String apellido, Integer edad, Integer cantidadGoles, Integer posicion) {
        super(id, nombre, apellido, edad);
        this.cantidadGoles = cantidadGoles;
        this.posicion = posicion;
    }

    public Futbolista() {
    }

    public Integer getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(Integer cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public void jugarPartido() {
        System.out.println("Juega un partido");
    }
    
    public void entrenar() {
        System.out.println("Entrena");
    }
}

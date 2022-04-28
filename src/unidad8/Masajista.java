package unidad8;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer anhosExperiencia;

    public Masajista(Integer id, String nombre, String apellido, Integer edad, String titulacion, Integer anhosExperiencia ) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    public Masajista() {
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAnhosExperiencia() {
        return anhosExperiencia;
    }

    public void setAnhosExperiencia(Integer anhosExperiencia) {
        this.anhosExperiencia = anhosExperiencia;
    }
    
    public void darMasaje() {
        System.out.println("Da un masaje");
    }
}

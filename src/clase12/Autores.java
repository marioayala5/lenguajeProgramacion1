package clase12;

public class Autores {

    private int idAutor;
    private String nombrePila;
    private String apellidoPaterno;

    public Autores() {
    }

    public Autores(int idAutor, String nombrePila, String apellidoPaterno) {
        this.idAutor = idAutor;
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

}

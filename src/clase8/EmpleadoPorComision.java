package clase8;

public class EmpleadoPorComision {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
    }

    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "empleado por comision", primerNombre, apellidoPaterno,
                "numero de seguro social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas,
                "tarifa de comision", tarifaComision);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas >= 0.0) {
            this.ventasBrutas = ventasBrutas;
        } else {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision > 0.0 && tarifaComision < 1.0) {
            this.tarifaComision = tarifaComision;
        } else {
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
    }

}

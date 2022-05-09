package unidad9;

public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) {
        super(nombre, apellido, nss);
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifa) {
        if (tarifa > 0.0 && tarifa < 1.0) {
            tarifaComision = tarifa;
        } else {
            throw  new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
    }

    @Override
    public double ingresos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}

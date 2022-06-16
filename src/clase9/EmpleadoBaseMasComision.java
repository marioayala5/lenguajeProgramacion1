package clase9;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        setSalarioBase(salario);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
        if (salario >= 0.0) {
            salarioBase = salario;
        } else {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "con sueldo base", super.toString(), "sueldo base", salarioBase);
    }

    @Override
    public double ingresos() {
        return salarioBase + super.ingresos();
    }
}

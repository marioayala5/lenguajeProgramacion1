package unidad2;

public class Empleado {

    private String nombre, apellPater;
    private double salario;

    //metodo constructor
    public Empleado(String nombre, String apellPater, double salario) {
        this.nombre = nombre;
        this.apellPater = apellPater;
        this.salario = salario;
    }

    public Empleado() {
    }

    //metodo get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellPater() {
        return apellPater;
    }

    public void setApellPater(String apellPater) {
        this.apellPater = apellPater;
    }

    public double getSalario() {
        return salario * 12;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public void SalarioAnual(String nombre, String apellPater, double salario) {
        double salanu;
        salanu = salario * 12;

        System.out.print("EMPLEADO 1\n**********\n");
        System.out.printf("El salario anual del empleado %s %s es %.2f\n", nombre, apellPater, salanu);
    }

    public void SalarioAnualPorcen(String nombre, String apellPater, double salario) {
        double salanu, salaumen;
        salanu = salario * 12;
        salaumen = salanu + (salanu * 0.10);

        System.out.print("\nEMPLEADO 1 con aumento del 10%\n******************************\n");
        System.out.printf("El salario anual del empleado %s %s es %.2f\n", nombre, apellPater, salaumen);
    }
}

package unidad2;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado emple1 = new Empleado();
        Empleado emple2 = new Empleado("Hernan", "Allende", 2000.00);

        emple1.SalarioAnual("Mario", "Ayala", 1000);
        System.out.print("\nEMPLEADO 2\n**********\n");
        System.out.printf("El salario anual del empleado %s %s es %.2f\n", emple2.getNombre(), emple2.getApellPater(), emple2.getSalario());

        emple1.SalarioAnualPorcen("Mario", "Ayala", 1000);
        System.out.print("\nEMPLEADO 2 con aumento del 10%\n******************************\n");
        System.out.printf("El salario anual del empleado %s %s es %.2f\n", emple2.getNombre(), emple2.getApellPater(), emple2.getSalario() + (emple2.getSalario() * 0.10));
    }

}

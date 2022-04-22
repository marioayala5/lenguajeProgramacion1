package clase8;

public class PruebaEmpleadoPorComision {

    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision("Mario", "Ayala", "22-2-222", 10000, .06);
        
        System.out.println("Informacion del empleado obtenida por los metodos establecer: \n");
        System.out.printf("%s %s\n", "El primer nombre es", empleado.getPrimerNombre());
        System.out.printf("%s %s\n", "El apellido paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s\n", "El numero social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %.2f\n", "Las ventas brutas son", empleado.getVentasBrutas());
        System.out.printf("%s %.2f\n", "La tarifa de comision es", empleado.getTarifaComision());

        try {
            empleado.setVentasBrutas(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.printf("\n%s:\n\n%s\n", "Informacion actualizada del empleado, obetnida mediante toString", empleado);
    }
    
}

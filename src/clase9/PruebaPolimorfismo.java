package clase9;

public class PruebaPolimorfismo {

    public static void main(String[] args) {
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "222-22-222", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "333-33-333", 5000, .04, 300);

        System.out.printf("%s %s:\n\n%s\n\n", "Llamada a ToString de EmpleadoPorComision con "
                + "referencia de superclase a un objeto de la superclase", empleadoPorComision.toString());

        System.out.printf("%s %s:ºnºn%s\n\n", "Llamada a ToString de EmpleadoBaseMasComision con "
                + "referencia de subclase a un objeto de la superclase", empleadoBaseMasComision.toString()
        );
        
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;
        
        System.out.printf("%s %s: \n\n%s\n", "Llamada a toString de EmpleadoBaseMasComision con "
                + "referencia de superclase a un objeto de la subclase", empleadoPorComision2.toString());
    }

}

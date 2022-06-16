package clase10;

public class UsoDeExcepciones {

    public static void main(String[] args) {
        try {
            lanzarExcepcion();
        } catch (Exception e) {
            System.err.println("La excepcion se manejo en main");
        }

        noLanzarExcepcion();
    }

    private static void lanzarExcepcion() throws Exception {
        try {

            System.out.println("Metodo LanzaExcepcion");
            throw new Exception();

        } catch (Exception e) {
            System.err.println("La excepcion se manejo en el metodo LanzaExcepcion");
            throw e;
        } finally {
            System.err.println("Se ejecuto finally en LanzaExcepcion");
        }
    }

    private static void noLanzarExcepcion() {
        try {

            System.out.println("Metodo noLanzaExcepcion");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.err.println("Se ejecuto finally en noLanzaExcepcion");
        }

        System.err.println("Fin del metodo noLanzaExcepcion");
    }
}

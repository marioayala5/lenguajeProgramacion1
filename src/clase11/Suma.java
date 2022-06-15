package clase11;

import javax.swing.JOptionPane;

public class Suma {

    public static void main(String[] args) {
        String primerNro = JOptionPane.showInputDialog("Introduce primer numero: ");
        String segundoNro = JOptionPane.showInputDialog("Introduce primer numero: ");

        int nro1 = Integer.parseInt(primerNro);
        int nro2 = Integer.parseInt(segundoNro);

        int suma = nro1 + nro2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma de dos numeros", JOptionPane.INFORMATION_MESSAGE);
    }

}

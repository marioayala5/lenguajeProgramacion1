package unidad7;

public class CuentaDeAhorros {

    static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros() {
    }

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double calcularInteresMensual() {
        double interesmensual;
        tasaInteresAnual = 4;
        interesmensual = ((saldoAhorros * tasaInteresAnual) / 12) / 100;
        return interesmensual;
    }
    
    public static double modificarTasaInteres (double saldo, double nro) {
        double interesmensual;
        interesmensual = ((saldo * nro) / 12) / 100;
        return interesmensual;
    }
}

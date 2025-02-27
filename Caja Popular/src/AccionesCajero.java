import javax.swing.JOptionPane;

public class AccionesCajero {
    private double saldo;
    private int numeroCuenta;
    private String titular;
    private int edad;


    public AccionesCajero(double saldoInicial, int numeroCuenta, String titular, int edad) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo actual: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consultarDatosCuenta() {
        JOptionPane.showMessageDialog(null, "Datos de la cuenta:\nNúmero de Cuenta: " + numeroCuenta + "\nTitular: " + titular + "\nEdad: " + edad + "\nSaldo actual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int ingreseElNumeroDeCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
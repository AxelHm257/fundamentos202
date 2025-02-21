import javax.swing.JOptionPane;

public class AccionesCajero {
    double saldo;
    String numeroCuenta;
    String titular;
    int edad;

    public AccionesCajero(double saldoInicial, String numeroCuenta, String titular, int edad) {
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
}
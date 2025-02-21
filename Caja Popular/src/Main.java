import javax.swing.*;

public static void main(String[] args) {
    AccionesCajero caja = new AccionesCajero(500, "12345678", "Juan Pérez", 30);
    String opcion;
    do {
        opcion = JOptionPane.showInputDialog("Menú:\n 1. Depositar\n 2. Retirar\n 3. Consultar Saldo\n 4. Consultar Datos de la Cuenta\n 5. Salir\n Elija una opción:");
        switch (opcion) {
            case "1":
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                caja.depositar(deposito);
                break;
            case "2":
                double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                caja.retirar(retiro);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Saldo actual: " + caja.consultarSaldo());
                break;
            case "4":
                caja.consultarDatosCuenta();
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
        }
    } while (!opcion.equals("5"));
}

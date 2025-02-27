import javax.swing.*;

public static void main(String[] args) {


   AccionesCajero caja1= new AccionesCajero(0,0,"temporal",0);
   
   caja1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo")+ caja1.getSaldo()));
   caja1.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta")+caja1.getNumeroCuenta()));
   caja1.setTitular(JOptionPane.showInputDialog("Ingrese el titular")+ caja1.getTitular());
   caja1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad")+ caja1.getEdad()));

    String opcion;

    do {
        opcion = JOptionPane.showInputDialog("Menú:\n 1. Depositar\n 2. Retirar\n 3. Consultar Saldo\n 4. Consultar Datos de la Cuenta\n 5. Salir\n Elija una opción:");
        switch (opcion) {
            case "1":
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                caja1.depositar(deposito);
                break;
            case "2":
                double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                caja1.retirar(retiro);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Saldo actual: " + caja1.consultarSaldo());
                break;
            case "4":
                caja1.consultarDatosCuenta();
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
        }
    } while (!opcion.equals("5"));
}

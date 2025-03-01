import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class GestionEnvios {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");  // Depuración: Se ejecuta el main
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Conductor> conductores = new ArrayList<>();
        List<Envio> envios = new ArrayList<>();
        List<Entrega> entregas = new ArrayList<>();

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("Menu:\n1. Registrar Vehiculo\n2. Registrar Conductor\n3. Asignar Conductor\n4. Registrar Envio\n5. Registrar Entrega\n6. Actualizar Entrega\n7. Salir");
            System.out.println("Opción seleccionada: " + opcion);  // Depuración
            switch (opcion) {
                case "1": vehiculos.add(new Vehiculo(
                        JOptionPane.showInputDialog("Placa:"),
                        JOptionPane.showInputDialog("Modelo:"),
                        Double.parseDouble(JOptionPane.showInputDialog("Capacidad de carga:")))); break;
                case "2": conductores.add(new Conductor(
                        JOptionPane.showInputDialog("Nombre:"),
                        JOptionPane.showInputDialog("Identificación:"),
                        JOptionPane.showInputDialog("Licencia:"))); break;
                case "3": if (!vehiculos.isEmpty() && !conductores.isEmpty())
                    vehiculos.get(0).asignarConductor(conductores.get(0)); break;
                case "4": envios.add(new Envio(
                        JOptionPane.showInputDialog("Código Envío:"),
                        JOptionPane.showInputDialog("Destino:"),
                        Double.parseDouble(JOptionPane.showInputDialog("Peso:")))); break;
                case "5": entregas.add(new Entrega(JOptionPane.showInputDialog("Número de Guía:"))); break;
                case "6": if (!entregas.isEmpty())
                    entregas.get(0).actualizarEstado(JOptionPane.showInputDialog("Nuevo Estado:")); break;
                default: break;
            }
        } while (!opcion.equals("7"));
    }
}

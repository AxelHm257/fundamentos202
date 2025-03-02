import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Conductor> conductores = new ArrayList<>();
        List<Envio> envios = new ArrayList<>();
        List<Entrega> entregas = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú:\n" +
                            "1. Registrar Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor a Vehículo\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir"
            );

            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
                    vehiculos.add(new Vehiculo(placa, modelo, capacidad));
                    break;
                case "2":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    conductores.add(new Conductor(nombre, identificacion, licencia));
                    break;
                case "3":
                    if (vehiculos.isEmpty() || conductores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe registrar vehículos y conductores primero.");
                    } else {
                        vehiculos.get(0).asignarConductor(conductores.get(0));
                        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo.");
                    }
                    break;
                case "4":
                    String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío:");
                    String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío:"));
                    envios.add(new Envio(codigoEnvio, destino, peso));
                    break;
                case "5":
                    String guia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                    entregas.add(new Entrega(guia));
                    break;
                case "6":
                    if (!entregas.isEmpty()) {
                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                        entregas.get(0).actualizarEstado(nuevoEstado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay entregas registradas.");
                    }
                    break;
                case "7":
                    StringBuilder info = new StringBuilder("Información:\n");
                    for (Vehiculo v : vehiculos) info.append(v.obtenerInfo()).append("\n");
                    for (Envio e : envios) info.append(e.obtenerInfo()).append("\n");
                    for (Entrega ent : entregas) info.append(ent.obtenerInfo()).append("\n");
                    JOptionPane.showMessageDialog(null, info.toString());
                    break;
                case "8":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}

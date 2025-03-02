import javax.swing.*;

class Vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public double getCapacidadCarga() { return capacidadCarga; }
    public Conductor getConductor() { return conductor; }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo ya tiene un conductor asignado.");
        }
    }

    public String obtenerInfo() {
        return "Vehículo: " + placa + ", Modelo: " + modelo + ", Capacidad: " + capacidadCarga +
                (conductor != null ? ", Conductor: " + conductor.getNombre() : "");
    }
}

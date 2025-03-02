import javax.swing.*;

class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido.");
        }
    }

    public String obtenerInfo() {
        return "Entrega: " + numeroGuia + ", Estado: " + estado;
    }
}

import javax.swing.*;

public class Envio {
    private String codigoEnvio, destino;
    private double peso;

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigoEnvio() { return codigoEnvio; }
    public void setCodigoEnvio(String codigoEnvio) { this.codigoEnvio = codigoEnvio; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}

class Entrega {
    private String numeroGuia, estado = "Pendiente";

    public Entrega(String numeroGuia) { this.numeroGuia = numeroGuia; }

    public String getNumeroGuia() { return numeroGuia; }
    public void setNumeroGuia(String numeroGuia) { this.numeroGuia = numeroGuia; }

    public String getEstado() { return estado; }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado"))
            this.estado = nuevoEstado;
        else JOptionPane.showMessageDialog(null, "Estado inválido.");
    }
}
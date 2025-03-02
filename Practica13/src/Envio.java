import javax.swing.*;

class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String obtenerInfo() {
        return "Envío: " + codigoEnvio + ", Destino: " + destino + ", Peso: " + peso;
    }
}
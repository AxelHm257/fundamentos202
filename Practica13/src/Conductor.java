class Conductor {
    private String nombre;
    private String identificacion;
    private String licencia;

    public Conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getLicencia() { return licencia; }
}

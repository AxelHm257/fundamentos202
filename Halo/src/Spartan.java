public class Spartan {

    private String nombre;

    private int salud;
    private int escudo;
    private String armaPrincipal;

    public Spartan(String nombre, int escudo, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
        System.out.println("---------Información del Spartan--------");
        System.out.println("Spartan: " + nombre);
        System.out.println("% de salud: " + salud);
        System.out.println("% de escudo: " + escudo);
        System.out.println("Arma disponible: " + armaPrincipal);
        System.out.println("----------------------------------------");

    } //llave mostrar info

    public void atacar(String enemigo){

        System.out.println(nombre + " ataca a " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones) {
        int restantes = 10;
        int total = restantes + municiones;

        System.out.println(armaPrincipal + " ahora tiene disponible " + total + "balas");
    }

    public void correr(boolean status){

        if (status){
            System.out.println( nombre + " esta corriendo...");
        }else{
            System.out.println( nombre+ " se detuvo");
        }
    }

    private void ConsultaCortana(){
        System.out.println(" esta consultando...");
    }


    public String getNombre() {
        return nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }


}//llave de la clase
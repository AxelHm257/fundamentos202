public class Main {
    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan jefemaestro = new Spartan();

        //usamos sus atributos
        jefemaestro.nombre = "John";
        jefemaestro.salud = 100;
        jefemaestro.escudo = 100;
        jefemaestro.armaPrincipal = "Rifle de asalto";

        //invocamos los métodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

        //Creamos el segundo objeto
        Spartan emile = new Spartan();
        emile.nombre = "Emile-A239";
        emile.salud = 100;
        emile.escudo = 150;
        emile.armaPrincipal = "Escopeta";

        emile.mostrarInfo();
        emile.atacar("Hunter");
        emile.recargarArma(4);
        emile.correr(false);
    }
}
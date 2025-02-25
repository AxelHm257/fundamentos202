public class Main {
    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan jefemaestro = new Spartan("John",100,100,"Rifle de Asalto");

        //invocamos los métodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);
        
        //Usamos get y set para cambiar attributo nombre
        jefemaestro.setNombre("Axel");
        jefemaestro.mostrarInfo();
        System.out.println(jefemaestro.getNombre());

        //Creamos el segundo objeto
        Spartan emile = new Spartan("Emile-A239",50,100,"Escopeta");

        emile.mostrarInfo();
        emile.atacar("Hunter");
        emile.recargarArma(4);
        emile.correr(false);
    }
}
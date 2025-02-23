import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Passwords primera=new Passwords();
        int largo =8;
        String entradai=JOptionPane.showInputDialog("Ingrese la longitud del pasword: ");
                if (entradai != null && !(entradai.isEmpty()) ){
            largo=Integer.parseInt(entradai);
        }
        String contra= primera.Generador(largo);

        JOptionPane.showMessageDialog(null, "La password es:  "+ contra);

        primera.seguridad(contra);


    }
}
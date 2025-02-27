import java.util.Random;
import javax.swing.*;
public class Passwords {
    private String maylet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String minlet = "abcdefghijklmnopqrstuvwxyz10234567890";
    private String especial = "@+*#%<>-!";

    //Zona GET Set
    public String getMaylet() {
        return maylet;
    }

    public void setMaylet(String maylet) {
        this.maylet = maylet;
    }

    public String getMinlet() {
        return minlet;
    }

    public void setMinlet(String minlet) {
        this.minlet = minlet;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String Generador(int length) {
        int mayusc = JOptionPane.showConfirmDialog(null, "Desea que su password tenga letras mayusculas?", "Pregunta", JOptionPane.YES_NO_OPTION);
        boolean validacionmayusculas = mayusc == JOptionPane.YES_OPTION;
        int caracter = JOptionPane.showConfirmDialog(null, "Desea que su password tenga caracteres especiales?", "Pregunta", JOptionPane.YES_NO_OPTION);
        boolean validacioncaracter = caracter == JOptionPane.YES_OPTION;
        if (validacionmayusculas) {
            minlet += maylet;
        }
        if (validacioncaracter) {
            minlet += especial;
        }
        char[] contraseña = new char[length];
        Random numrand = new Random();
        for (int i = 0; i < length; i++) {
            int index = numrand.nextInt(minlet.length());
            contraseña[i] = minlet.charAt(index);

        }
        return new String(contraseña);
    }

    public void seguridad(String contra) {

        int contadormay = 0;
        int contadorespecial = 0;
        for (int i = 0; i < contra.length(); i++) {
            if (maylet.contains(String.valueOf(contra.charAt(i)))) {
                contadormay++;
            }
        }

        for (int k = 0; k < contra.length(); k++) {
            if (especial.contains(String.valueOf(contra.charAt(k)))) {
                contadorespecial++;
            }

        }

        if (contadormay >=3 || contadorespecial >=3) {
            JOptionPane.showMessageDialog(null,"Seguridad: Alta");
        } else if (contadorespecial ==2 || contadormay == 2) {
            JOptionPane.showMessageDialog(null,"Seguridad: Media");
        }else {
            JOptionPane.showMessageDialog(null,"Seguridad: Baja");
        }

    }
}
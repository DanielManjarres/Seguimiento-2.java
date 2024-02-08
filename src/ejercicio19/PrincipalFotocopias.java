package ejercicio19;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class PrincipalFotocopias {
    public static void main(String[] args) {
        Fotocopias fotocopias = new Fotocopias();
        do {
            fotocopias.setCopy(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cuantas copias desea sacar")));
        }while (fotocopias.getCopy() <= 0);
           JOptionPane.showMessageDialog(null,"En total serian "+fotocopias.calcPay());
    }
}

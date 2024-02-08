package ejercicio16;

import javax.swing.*;

public class PrincipalSubsidio {
    public static void main(String[] args) {
        Subsidio subsidio = new Subsidio();

        subsidio.setGender(JOptionPane.showInputDialog(null,"Ingrese su genero\nEscriba F si es femenino\nEscriba M si es masculino"));
        subsidio.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        JOptionPane.showMessageDialog(null, subsidio.subsidioMessage());

    }
}

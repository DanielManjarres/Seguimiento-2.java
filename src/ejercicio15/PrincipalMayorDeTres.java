package ejercicio15;

import javax.swing.*;

public class PrincipalMayorDeTres {
    public static void main(String[] args) {
        MayorDeTres mayorDeTres = new MayorDeTres();

        mayorDeTres.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 1"));
        mayorDeTres.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 2"));
        mayorDeTres.num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 3"));

        JOptionPane.showMessageDialog(null, mayorDeTres.comparation());

    }
}

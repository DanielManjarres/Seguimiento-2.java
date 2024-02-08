package ejercicio21;

import javax.swing.*;

public class PrincipalAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();

        automovil.setModel(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo del carro")));

        JOptionPane.showMessageDialog(null,automovil.review());
    }
}

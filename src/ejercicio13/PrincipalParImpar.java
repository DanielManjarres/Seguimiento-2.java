package ejercicio13;

import javax.swing.*;

public class PrincipalParImpar {
    public static void main(String[] args) {
        ParImpar parImpar = new ParImpar();

        parImpar.setNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para saber si es par o Impar")));
        JOptionPane.showMessageDialog(null, "El numero "+parImpar.getNumber()+" es "+ parImpar.parImpar());
    }
}

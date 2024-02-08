package ejercicio11;

import javax.swing.*;

public class PrincipalPositivoNegativo {
    public static void main(String[] args) {
        PositivoNegativo positivoNegativo = new PositivoNegativo();

        positivoNegativo.setNumber(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para saber si es positivo o negrativo")));
        JOptionPane.showMessageDialog(null,"El numero "+ positivoNegativo.getNumber()+ " es " + positivoNegativo.calc());
    }
}

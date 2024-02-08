package ejercicio7;

import javax.swing.*;

public class PrincipalAreaRectangulo {
    public static void main(String[] args) {
        AreaRectangulo areaRectangulo  = new AreaRectangulo();

        areaRectangulo.validaDatosIngresados();
        JOptionPane.showMessageDialog(null,"Area: " + areaRectangulo.calcularArea());
    }
}

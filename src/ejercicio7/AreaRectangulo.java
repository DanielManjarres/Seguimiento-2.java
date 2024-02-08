package ejercicio7;

import javax.swing.*;

public class AreaRectangulo {
    public float alt;
    public float base;

    public void validaDatosIngresados(){
        do{
            this.base = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la Base:"));
        }while (this.base <= 0 );
        do{
            this.alt = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la Altura:"));
        }while (this.alt <= 0);
    }
    public float calcularArea(){
        return this.alt * this.base;
    }
}

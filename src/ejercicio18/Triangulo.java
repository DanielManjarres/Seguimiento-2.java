package ejercicio18;

import javax.swing.*;

public class Triangulo {
    private int ang;
    private int sum;

    public int getAng() {
        return ang;
    }

    public void setAng(int ang) {
        this.ang = ang;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String calcTrian(){
        for (int i = 1; i < 4; i++) {
            this.setAng(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el angulo "+i)));
            this.setSum(this.getSum() + this.getAng());
        }
        if (this.getSum() == 180){
            return "Es un triangulo ya que sus angulos suman 180 grados";
        }
        return "No es un triangulo ya que sus angulos no suman 180 grados";
    }
}

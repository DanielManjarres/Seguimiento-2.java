package ejercicio14;

import javax.swing.*;

public class Notas {
    public float[] note = {0,0,0,0,0};
    public float sum;
    public float prom;
    public String[] materias = {"Fisica", "Quimica","Biologia", "Matematicas", "Informatica"};
    public void sum(){
        for (int i = 0; i <= 4; i++) {
            note[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota de " + materias[i]));
            this.sum = this.sum + note[i];
        }
    }
    public float prom(){
        return this.sum/5;
    }
}

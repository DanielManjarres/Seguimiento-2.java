package ejercicio14;

import javax.swing.*;

public class PrincipalNotas {
    public static void main(String[] args) {
        Notas notas = new Notas();
        notas.sum();
        JOptionPane.showMessageDialog(null, "Fisica: "+ notas.note[0]+"\nQuimica: "+ notas.note[1]+
                "\nBiologia: "+ notas.note[2]+"\nMatematicas: "+ notas.note[3]+"\nInformatica: "+ notas.note[4]+
                "\nPromedio: "+notas.prom());
    }
}

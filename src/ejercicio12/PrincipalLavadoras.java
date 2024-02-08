package ejercicio12;

import javax.swing.*;

public class PrincipalLavadoras {
    public static void main(String[] args) {
        Lavadoras lavadoras = new Lavadoras();

        lavadoras.setBigWasher(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas lavadoras grandes va alquilar")));
        lavadoras.setSmallWasher(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas lavadoras pequeñas va alquilar")));
        lavadoras.setWashingMachines(lavadoras.getBigWasher() + lavadoras.getSmallWasher());
        lavadoras.hours =Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas horas se alquilaran"));

        if (lavadoras.getWashingMachines() > 3){
            JOptionPane.showMessageDialog(null, "Pago normal: "+ (lavadoras.hours * (4000 * lavadoras.getBigWasher()) + lavadoras.hours * (3000 * lavadoras.getSmallWasher())) +"\nDescuento del 3%: "
                    +(((lavadoras.hours * (4000 * lavadoras.getBigWasher()) + lavadoras.hours * (3000 * lavadoras.getSmallWasher()))) * 0.03f) + "\nTotal a pagar: " + lavadoras.payCalculator());
        }else {
            JOptionPane.showMessageDialog(null, "Total a pagar: "+ lavadoras.payCalculator());
        }
    }
}

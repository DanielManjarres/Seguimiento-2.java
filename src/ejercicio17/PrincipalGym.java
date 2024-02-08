package ejercicio17;

import javax.swing.*;

public class PrincipalGym {
    public static void main(String[] args) {
        Gym gym = new Gym();

        do {
            gym.setMounth(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la opcion de mensualidad\n1. 15 dias" +
                    "\n2. 30 dias\n3. 3 meses")));
        }while (gym.getMounth() != 1 && gym.getMounth() != 2 && gym.getMounth() != 3);
        JOptionPane.showMessageDialog(null,gym.calcularMensualida());
    }
}


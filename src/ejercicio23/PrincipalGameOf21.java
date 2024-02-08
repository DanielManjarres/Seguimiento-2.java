package ejercicio23;


import javax.swing.*;

public class PrincipalGameOf21 {
    public static void main(String[] args) {
        GameOf21 gameOf21 = new GameOf21();
        int counter;
        gameOf21.setUserName(JOptionPane.showInputDialog(null,"Jugador, Ingrerse su nombre"));
        do {
            gameOf21.setAsk(Integer.parseInt(JOptionPane.showInputDialog(null,"El juego de 21 ha empezado!\n1. Pedir\n2. Salir")));
        }while (gameOf21.getAsk() != 1 && gameOf21.getAsk() != 2);

        if (gameOf21.getAsk() == 1){
            do{
                gameOf21.game();
                if (gameOf21.getUser() >= 21 || gameOf21.getMachine() >= 21) {
                    counter = 2;
                }else {
                    counter = Integer.parseInt(JOptionPane.showInputDialog(null,gameOf21.getUserName()+": "+ gameOf21.getUser() + "\nMaquina: "+ gameOf21.getMachine() + "\nDesea pedir\n1. Pedir\n2. Plantarme"));
                }

            }while (counter != 2);
        }
        if (gameOf21.getAsk() == 1){
            JOptionPane.showMessageDialog(null,gameOf21.winnerLoser());
        }
        JOptionPane.showMessageDialog(null,"Muchas gracias por jugar");
    }
}

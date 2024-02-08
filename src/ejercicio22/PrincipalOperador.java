package ejercicio22;

import javax.swing.*;

public class PrincipalOperador {
    public static void main(String[] args) {
        Operador operador = new Operador();

        do{
            operador.setSelec(Integer.parseInt(JOptionPane.showInputDialog(null,"Que operador es\n1. Tigo\n2. Claro\n3. Movistar")));
        }while (operador.getSelec() != 1 && operador.getSelec() != 2 && operador.getSelec() != 3);

        do{
            operador.setMinutes(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos minutos internacionales ha consumido")));
        }while (operador.getMinutes() <= 0);
        operador.selectorOper();
        JOptionPane.showMessageDialog(null,"Operador: "+ operador.getOper() + "\nPago Total: $" + operador.packs());
    }

}

package ejercicio5;

import javax.swing.*;

public class SemaforoPrincipal {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        int selec;

        if (semaforo.onOff.booleanValue() == false){
           // do {
                selec = Integer.parseInt(JOptionPane.showInputDialog(null, "El semaforo está apagado," +
                        " desea encenderlo?\n1. Si\n2. No\nDigite el numero de su seleccion:"));
                System.out.println(selec);
            //} while (selec != 1 || selec != 2);
            if (selec == 1){
                semaforo.onOff();
            }else if (selec == 2){
                JOptionPane.showMessageDialog(null, "El semaforo permanecerá apagado...");
            }
        }
        boolean flag = true;
        do {
            if (semaforo.onOff.booleanValue()){

                JOptionPane.showMessageDialog(null, "Semaforo encendido!\nColor: "
                        + semaforo.colorLightbulb +"\nMensaje: " + semaforo.messageVehicle());
                int selec2 = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Cambiar color\n2. Apagar el semaforo"));
                if (selec2 == 1){
                    semaforo.changeColor();
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha apagado el semaforo");
                    semaforo.onOff = false;
                    flag = false;
                }

            }
        }while (flag);

    }
}

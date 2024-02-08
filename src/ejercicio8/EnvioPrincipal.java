package ejercicio8;

import javax.swing.*;

public class EnvioPrincipal {
    public static void main(String[] args) {
        Envio envio = new Envio();
        int selec;
        int selec2;
        String selec3;
        do{
            selec = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Verificar entrega\n2. Salir"));

        }while (selec != 1 && selec != 2);
        if (selec == 1){
            selec2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Buscar por Cedula\n2. Buscar por numero de Guia"));
            switch (selec2){
                case 1:
                    selec3 = JOptionPane.showInputDialog(null, "Ingrese la cedula para la busqueda: ");
                    if (selec3.equals(envio.idClient)){
                        envio.calcularCosto();
                        JOptionPane.showMessageDialog(null, envio.verificarEntrega());
                    }
                    break;
                case 2:
                    selec3 = JOptionPane.showInputDialog(null, "Ingrese el numero de Guia para la busqueda: ");
                    if (selec3.equals(envio.guideNumber)){
                        envio.calcularCosto();
                        JOptionPane.showMessageDialog(null, envio.verificarEntrega());
                    }
                    break;
            }
        }
    }
}

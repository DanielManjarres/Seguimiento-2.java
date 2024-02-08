package ejercicio9;

import javax.swing.*;

public class PrincipalReclamo {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();

        int selec;
        do {
            selec = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Validar estado del reclamo.\n2.Mensaje de recion del reclamo."));
        }while (selec != 1 && selec !=2);
        if (selec == 1){
            JOptionPane.showMessageDialog(null,reclamo.validarClaimStatus());
        }else {
            JOptionPane.showMessageDialog(null,reclamo.messageClaimReception());
        }
    }
}

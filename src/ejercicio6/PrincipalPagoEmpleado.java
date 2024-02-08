package ejercicio6;

import javax.swing.*;

public class PrincipalPagoEmpleado {
    public static void main(String[] args) {
        PagoEmpleado pagoEmpleado = new PagoEmpleado();
        boolean flag = true;
        int a = pagoEmpleado.codEmpleado;
        while (flag){
            pagoEmpleado.codEmpleado= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Codigo del trabajador:"));
            if (pagoEmpleado.codEmpleado==a){
                JOptionPane.showMessageDialog(null, "El empleado con codigo: "+pagoEmpleado.codEmpleado+"\nTiene un salario base de: $"+pagoEmpleado.getSalarioBasico()+"\nCon horas extras trabajadas: "+pagoEmpleado.gethExtras()+"\nValor por hora extra: $"+pagoEmpleado.valorhExtras
                        +"\nDescuentos por seguridad y salud: $"+pagoEmpleado.getDescuento()+"\nDescuento por prestamo con la empresa: $"+pagoEmpleado.getDescuentoPrestamo()+
                        "\nBonificacion de la empresa de: $"+pagoEmpleado.getBonificacion()+"\nGanancia por horas extras: $"+pagoEmpleado.calcularValorHE()+"\n"+
                        "\nTotal de ganancias: $"+pagoEmpleado.ganancias()+"\nTotal de deducidos: $"+pagoEmpleado.reduccion()+"\nGanancia neta de salario: $"+pagoEmpleado.vNeto());
                flag = false;
            }else {
                flag = true;
            }
        }


    }
}

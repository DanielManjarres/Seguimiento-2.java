package ejercicio10;

import javax.swing.*;

public class PrincipalSalario {
    public static void main(String[] args) {
        Salario salario = new Salario();

        salario.setName(JOptionPane.showInputDialog(null,"Ingrese su nombre"));
        salario.setHours(Integer.parseInt(JOptionPane.showInputDialog(null, "CALCULAR SALARIO\nDigite cuantas horas a las semana trabajó:")));
        JOptionPane.showMessageDialog(null, "Señor " + salario.getName()+" el numero de horas fueron "+ salario.getHours() +" y su salario equivales a "+salario.calcularSalary());
    }
}

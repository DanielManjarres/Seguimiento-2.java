package ejercicio3seg2;


import javax.swing.*;

public class LibroPrincipal {
    public static void main(String[] args) {
        Libro libro = new Libro();
        boolean flag = true;
        do {

            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 1 para ingreso del prestamo:\nIngrese 2 para consultar estado:" +
                    "\nIngrese 3 para consulta del prestamo:\nIngrese 4 para salir:"));

            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Ingreso del prestamo");
                    libro.cargarPrestamo();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Estado el prestamo");
                    JOptionPane.showMessageDialog(null,libro.estadoPrestamo());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Consulta del prestamo");
                    JOptionPane.showMessageDialog(null,libro.consultaPrestamo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Salio");
                    flag = false;
                    break;
            }

        }while (flag);
    }
}
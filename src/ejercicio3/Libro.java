package ejercicio3seg2;

import javax.swing.*;

public class Libro {
    public int codLibro;
    public String fecha="22/09/2024";
    public String nomLibro;
    public int codUsuario;
    public int diasPrestamo;
    public String estado = "Sin prestamos";

    public void cargarPrestamo(){
        codLibro = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del prestamo"));
        nomLibro = JOptionPane.showInputDialog(null,"Ingrese el nombre del libro");
        codUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su codigo de usuario"));
        diasPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los dias del prestamo"));
    }
    public String consultaPrestamo(){
        return "Codigo del libro: "+this.codLibro+"\nNombre del libro: "+this.nomLibro+"\nCodigo del usuario: "+this.codUsuario+
                "\nDias del prestamo: "+this.diasPrestamo+"\nFecha del prestamo: "+this.fecha ;
    }
    public String estadoPrestamo(){
        if (codLibro==0){
            return estado="Sin prestamos";
        }else {
            return estado = "Prestamo activo";
        }
    }
}

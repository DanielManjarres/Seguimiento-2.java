package ejercicio1;
import java.util.Scanner;
public class PrincipalUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner lector = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Ingrese su ususario: ");
            usuario.userIn = lector.next();

            if (!usuario.userIn.equals(usuario.getUsuarioBase())) {
                System.out.println("El USUARIO ES INCORRECTO");
            } else {
                System.out.println("Ingrese su contraseña: ");
                usuario.setClaveIngresada(lector.next());
                if (usuario.permitirAcceso()){
                    System.out.println(usuario.validarEstado() + "\nBienvenido usuario" +
                            " "+ usuario.getUsuarioBase() + "; Acceso permitido");
                    flag = false;
                }else {
                    System.out.println("Acceso denegado");
                }
            }
        }while(flag);


    }
}

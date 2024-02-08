package ejercicio2;
import java.util.Scanner;
public class PrincipalCitaMedica {
    public static void main(String[] args) {
        CitaMedica citaMedica = new CitaMedica();
        Scanner lector = new Scanner(System.in);
        citaMedica.codCita = CitaMedica.idcounter++;
        int[] cites = new int[20];
        int flag = 1;
        do {
            System.out.println("1. Crear Cita Medica.\n2. Consultar Cita.\nDigite 3 para salir del selector\nSeleccione una opcion:");
            int x = lector.nextInt();
            switch(x) {
                case 1:
                    citaMedica.crearCita();
                    System.out.println("La cita fue creada con exito!");
                    break;
                case 2:
                    System.out.println(citaMedica.consultarDatosCita());
                    break;
                case 3:
                    flag = 0;
                    break;
            }
        }while(flag == 1);
    }
}

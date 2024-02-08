package ejercicio2;
import java.util.Scanner;
public class CitaMedica {
    Scanner lector = new Scanner(System.in);
    public static int idcounter = 1;
    public int codCita;
    public String date;
    public String hour;
    public int consultorio;
    public String nameMedic;
    public String nameUser;
    private String centroMedico;

    public String getCentroMedico() {
        return centroMedico = "Parque central";
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public void crearCita(){
        System.out.println("Nombre del paciente:");
        this.nameUser = lector.next();

        System.out.println("Que dia desea elegir:\n0. Lunes\n1. Martes\n2. Miercoles\n3. Jueves\n4. Viernes");
        this.date = lector.next();
        switch (date) {
            case "0":
                this.date = "Lunes";
                break;
            case "1":
                this.date = "Martes";
                break;
            case "2":
                this.date = "Miercoles";
                break;
            case "3":
                this.date = "Jueves";
                break;
            case "4":
                this.date = "Viernes";
                break;
        }
        System.out.println("Selecciones un Medico:\n1. Jose Herrera\n2. Ana Martinez");
        int selecMedic = lector.nextInt();
        this.nameMedic = (selecMedic == 1) ? "Jose Herrera" : "Ana Martinez";

        System.out.println("Digite la hora de la cita:");
        this.hour = lector.next();
    }
    public String consultarDatosCita(){
        int rangoInicio = 1;
        int rangoFin = 11;
        this.consultorio = rangoInicio + (int) (Math.random() * (rangoFin - rangoInicio));
        return "Su cita medica\nID cita: "+ this.codCita +"\nNombre del paciente: "+ this.nameUser +"\nFecha y hora: " + this.date +" "+ this.hour
                + "\nNombre del doctor: " + this.nameMedic + "\nConsultorio: " + this.consultorio + "\nCentro medico: " +this.getCentroMedico();
    }
}

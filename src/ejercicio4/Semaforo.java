package ejercicio4;

import javax.swing.*;

public class Semaforo {
    public String colorLightbulb = "Red";
    public Boolean onOff = false;
    public String codeUser;

    public void changeColor() {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Si deseas cambiar " +
                "el color\n1. Rojo\n2. Amarillo\n3.Verde\nDigite el numero del color:"));
        if (x == 1){
            this.colorLightbulb = "Red";
        } else if (x == 2) {
            this.colorLightbulb = "Yellow";
        }else {
            this.colorLightbulb = "Green";
        }

    }
    public Boolean onOff(){
        return this.onOff = true;

    }
    public String messageVehicle(){
        if (this.colorLightbulb == "Red" ){
            return "Stop!";
        } else if (this.colorLightbulb == "Green") {
            return "Go";
        }else {
            return "Ready";
        }
    }

}

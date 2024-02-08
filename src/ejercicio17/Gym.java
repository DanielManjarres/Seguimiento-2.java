package ejercicio17;

public class Gym {
    private int mounth;

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public String calcularMensualida(){
        if (getMounth() == 1){
            return "Su mensualidad tiene un costo de $18000";
        } else if (getMounth() == 2) {
            return "Su mensualidad tiene un costo de $35000";
        }
        return "Su mensualidad tiene un costo de $86000";
    }
}

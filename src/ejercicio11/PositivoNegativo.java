package ejercicio11;

public class PositivoNegativo {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String calc(){
        if (this.getNumber()<0){
            return "Negativo";
        }
        return "Positivo";
    }
}

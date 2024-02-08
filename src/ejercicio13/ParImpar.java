package ejercicio13;

public class ParImpar {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String parImpar(){
        if (this.getNumber() %2 == 0){
            return "par";
        }
        return "impar";
    }
}

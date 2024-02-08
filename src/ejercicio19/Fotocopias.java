package ejercicio19;

public class Fotocopias {
    private int copy;

    public int getCopy() {
        return copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }

    public String calcPay(){
        if (this.getCopy() < 500) {
            return "$"+ getCopy() * 120;
        } else if (getCopy() > 499 && getCopy() < 750){
            return "$"+ getCopy() * 100;
        } else if (getCopy() > 749 && getCopy() < 1000) {
            return "$"+ getCopy() * 80;
        }else {
            return "$"+ getCopy() * 50;
        }
    }
}

package ejercicio15;

public class MayorDeTres {
    public int num1;
    public int num2;
    public int num3;

    public String comparation(){
        if (num1 > num2 && num1 > num3){
            return "El numero mayor es " + this.num1;
        } else if (num2 > num1 && num2 > num3) {
            return "El numero mayor es " + this.num2;
        }
        return "El numero mayor es " + this.num3;
    }
}

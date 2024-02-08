package ejercicio22;

public class Operador {
    private int selec;
    private String oper;
    private int minutes;
    public int getSelec() {
        return selec;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void setSelec(int selec) {
        this.selec = selec;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void  selectorOper(){
        if (this.getSelec() == 1){
            this.setOper("Tigo");
        } else if (this.getSelec() == 2) {
            this.setOper("Claro");
        }else {
            this.setOper("Movistar");
        }
    }
    public float packs(){
        if (getOper().equals("Tigo")){
            return getMinutes() * 200 + 45000 +12000;
        } else if (getOper().equals("Claro")) {
            return this.getMinutes() * 100 + 30000 + 18000;
        }
        return this.getMinutes() * 250 + 40000 + 8000;
    }
}
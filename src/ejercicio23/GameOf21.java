package ejercicio23;

import java.util.Random;

public class GameOf21 {
    Random random =new Random();
    private int user;
    private String userName;
    private int machine;
    private int ask;
    public int getUser() {
        return user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getMachine() {
        return machine;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void game(){
        for (int i = 0; i < 1; i++) {
            this.setUser((random.nextInt(9) + 1) + this.getUser());
            System.out.println(this.getUser());
            this.setMachine((random.nextInt(9) + 1) + this.getMachine());
        }
    }

    public String winnerLoser(){
        if (this.getUser()  > 21 && this.getMachine() > 21){
            return this.getUserName() + ": "+this.getUser()+"\nMaquina: "+ getMachine() +"\nSe han pasado de 21, ninguno ha ganado!";
        } else if (this.getUser() > 21 && this.getMachine()<=21) {
            return this.getUserName() + " se ha pasado con "+this.getUser()+" puntos, la maquina gana con "+ this.getMachine() + " puntos";
        } else if (this.getMachine() > 21 && this.getUser()<=21) {
            return "La maquina se ha pasado con "+this.getMachine()+" puntos, "+this.getUserName()+" gana con "+ this.getUser() + " puntos";
        } else{
            if (this.getUser() == this.getMachine()){
                return "Empate\nPuntos del empate: " +this.getUser();
            }else if (this.getUser() > this.getMachine()){
                return getUserName() + " es el ganador con "+ this.getUser() + " Puntos";
            }
            return "La maquina es la ganadora con "+ this.getMachine() + " Puntos";
        }
    }
}

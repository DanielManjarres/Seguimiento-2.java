package ejercicio16;

import java.util.Locale;

public class Subsidio {
    private String gender;
    public int age;
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String subsidioMessage(){
        if (this.getGender().toUpperCase().equals("F")){
            if (this.age >= 50){
                return "El apoyo es de $120000";
            }else {
                return "El apoyo es de $100000";
            }
        }else {
            return "El apoyo es de $40000";
        }
    }
}


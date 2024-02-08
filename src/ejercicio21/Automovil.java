package ejercicio21;

public class Automovil {
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String review(){

        if (getModel() == 119 || getModel() == 179 || (getModel() >= 189 && getModel() <=195) || getModel() == 221 || getModel() == 780) {
            return "Su modelo posee fallas";
        }
        return "Su modelo no posee fallas";
    }
}

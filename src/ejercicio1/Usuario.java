package ejercicio1;


public class Usuario {
    private String userBase = "admin";
    public String userIn;
    private String passwordBase = "0000";
    private String claveIngresada;
    public String getPasswordBase() {
        return this.passwordBase;
    }
    public String validarEstado(){
        return "Está activo";
    }
    public boolean permitirAcceso(){
        if(this.getClaveIngresada().equals(getPasswordBase())){
            return true;
        }
        return false;
    }
    public String getUsuarioBase() {
        return userBase;
    }
    public String getClaveIngresada() {
        return claveIngresada;
    }
    public void setClaveIngresada(String claveIngresada) {
        this.claveIngresada = claveIngresada;
    }
}

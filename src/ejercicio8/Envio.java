package ejercicio8;

public class Envio {
    public String guideNumber = "0000";
    private String date = "21 feb 2024";
    private String typeEmbalaje = "Pequeño";
    public String idClient = "10";
    private float weight = 8;
    private String cityOrigen = "Medellin";
    private String cityDestino = "Armenia";
    private float cost;
    private boolean statusEnvio = true;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeEmbalaje() {
        return typeEmbalaje;
    }

    public void setTypeEmbalaje(String typeEmbalaje) {
        this.typeEmbalaje = typeEmbalaje;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCityOrigen() {
        return cityOrigen;
    }

    public void setCityOrigen(String cityOrigen) {
        this.cityOrigen = cityOrigen;
    }

    public String getCityDestino() {
        return cityDestino;
    }

    public void setCityDestino(String cityDestino) {
        this.cityDestino = cityDestino;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isStatusEnvio() {
        return statusEnvio;
    }

    public void setStatusEnvio(boolean statusEnvio) {
        this.statusEnvio = statusEnvio;
    }
    public void calcularCosto(){
        this.setCost(10000 * getWeight());
    }

    public String verificarEntrega(){
        return "Numero guia: "+this.guideNumber+"\nCedula Cliente: "+ this.idClient +"\nFecha: "+this.getDate()+
                "\nPeso: "+this.getWeight()+"Kg\nCiudad Origen:"+this.getCityOrigen()+"\nCiudad Destino: "+this.getCityDestino()+
                "\nCosto: $" +this.getCost() + "\nEstado del envio: " + ((this.isStatusEnvio() == true) ? "En camino" : "Entregado");
    }
}

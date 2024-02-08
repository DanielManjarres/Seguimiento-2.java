package ejercicio9;

public class Reclamo {
    public int claimNumber;
    private String personName;
    private String asunto;
    public String claimDescription = "Se encuentra en proceso el reclamo";
    private  boolean claimStatus = true;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public boolean isClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(boolean claimStatus) {
        this.claimStatus = claimStatus;
    }
    public String validarClaimStatus(){
        if (this.isClaimStatus()){
            return "Activo";
        }
        return "No Activo";
    }

    public String messageClaimReception(){
        return this.claimDescription;
    }


}

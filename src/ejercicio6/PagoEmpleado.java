package ejercicio6;

public class PagoEmpleado {
    public int codEmpleado = 12345;
    private double salarioBasico=1000000;
    public int valorhExtras = 20000;
    private int hExtras = 12;
    private int descuento = 100000;
    private int descuentoPrestamo = 250000;
    private int bonificacion = 150000;
    private int neto;

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int gethExtras() {
        return hExtras;
    }

    public void sethExtras(int hExtras) {
        this.hExtras = hExtras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(int descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }
    public int calcularValorHE(){
        return (this.valorhExtras * this.gethExtras());
    }
    public int ganancias(){
        return (int) (this.getSalarioBasico()+this.getBonificacion()+this.calcularValorHE());
    }
    public int reduccion(){
        return (this.getDescuento()+this.getDescuentoPrestamo());
    }
    public int vNeto(){
        this.neto = (this.ganancias()-this.reduccion());
        return neto;
    }
}

package ejercicio10;

public class Salario {
    private String name;
    private int hours;
    private float salary = 30000;
    private float extraSalary = 33000;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(float extraSalary) {
        this.extraSalary = extraSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float calcularSalary(){
        if (this.getHours() <= 10) {
            return this.getHours() * this.getSalary();
        }
        return (10 * this.getSalary()) + (this.getHours() - 10) * this.getExtraSalary();
    }
}

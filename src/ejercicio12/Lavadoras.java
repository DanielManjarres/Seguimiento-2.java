package ejercicio12;

public class Lavadoras {
    private int washingMachines;
    private int smallWasher;
    public int paySmall;
    private int bigWasher;
    public int payBig;
    public int hours;

    public int getWashingMachines() {
        return washingMachines;
    }

    public void setWashingMachines(int washingMachines) {
        this.washingMachines = washingMachines;
    }

    public int getSmallWasher() {
        return smallWasher;
    }

    public void setSmallWasher(int smallWasher) {
        this.smallWasher = smallWasher;
    }

    public int getBigWasher() {
        return bigWasher;
    }

    public void setBigWasher(int bigWasher) {
        this.bigWasher = bigWasher;
    }
    public float payCalculator(){
        if (this.getWashingMachines() > 3){
            return (this.hours * (4000 * getBigWasher()) + this.hours * (3000 * getSmallWasher())) - ((this.hours * (4000 * getBigWasher()) + this.hours * (3000 * getSmallWasher()))* 0.03f) ;
        }
        return (this.hours * (4000 * getBigWasher()) + this.hours * (3000 * getSmallWasher()));
    }
}

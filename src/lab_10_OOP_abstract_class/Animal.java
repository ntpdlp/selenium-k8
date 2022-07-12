package lab_10_OOP_abstract_class;

public abstract class Animal {

    private int speedRacing;


    public Animal(){
        this.speedRacing = speed();
    }

    public abstract int speed();

    public int getSpeedRacing() {
        return speedRacing;
    }
}

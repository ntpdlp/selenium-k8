package lab_10;

import java.security.SecureRandom;

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

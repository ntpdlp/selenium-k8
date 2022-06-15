package lab_08.animal;

import java.security.SecureRandom;

public class Animal {

    private int speedRacing;

    public Animal(){}

    public Animal(int limit){
        setSpeedRacing(limit);

    }

    public int speed(int limit){
        return new SecureRandom().nextInt(limit);
    }

    public void setSpeedRacing(int speedRacing) {
        this.speedRacing = speed(speedRacing);
    }

    public int getSpeedRacing() {
        return speedRacing;
    }
}

package lab_08_OOP.animal;

import java.security.SecureRandom;

public class Animal {

    private int speedRacing;

    public Animal() {
    }

    public Animal(int limit) {
        this.speedRacing = speed(limit);

    }

    public int speed(int limit) {
        return new SecureRandom().nextInt(limit);
    }

    public int getSpeedRacing() {
        return speedRacing;
    }
}

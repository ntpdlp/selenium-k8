package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog(){}

    @Override
    public int speed() {
        return new SecureRandom().nextInt(60);
    }

}

package lab_10_OOP_abstract_class;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse(){}

    @Override
    public int speed() {
        return new SecureRandom().nextInt(75);
    }

}


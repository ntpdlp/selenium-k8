package lab_10_OOP_abstract_class;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger() {
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(100);
    }

}

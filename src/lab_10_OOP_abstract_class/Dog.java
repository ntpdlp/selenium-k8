package lab_10_OOP_abstract_class;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog(){}

    @Override
    public int speed() {
        return new SecureRandom().nextInt(60);
    }

}

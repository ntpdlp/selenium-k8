package lab_12_interface;

import java.util.Collections;

public class AnimalController {

    public static void main(String[] args) {
        new AnimalController().createSwimTeam(new Fish()); //why GOOD there.
//        new AnimalController().createSwimTeam(new Tiger()); //why error there ?? explain.

    }

    public void createSwimTeam(HasSwimable member){
        member.swimmable();
    }
}

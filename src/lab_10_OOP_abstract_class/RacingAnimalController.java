package lab_10_OOP_abstract_class;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalController {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        race(Arrays.asList(horse,tiger,dog));

    }
    public static void race(List<Animal> animalList){
        int max=0;
        String animalName ="";
        for (Animal animal : animalList) {
            System.out.println(animal.getClass().getSimpleName() + " speed: " + animal.getSpeedRacing());
            if(max<animal.getSpeedRacing()) {
                max=animal.getSpeedRacing();
                animalName=animal.getClass().getSimpleName();
            }
        }
        System.out.println("Winner is " + animalName + ", with speed: " + max);
    }

}

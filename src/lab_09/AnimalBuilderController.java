package lab_09;
import lab_08.animal.Animal;

import java.util.Arrays;
import java.util.List;

import static lab_09.AnimalBuilder.Builder;

public class AnimalBuilderController {

    public static void main(String[] args) {
        AnimalBuilder horse = new AnimalBuilder.Builder().setSpeedRacing(75).setFlyable(false).build();
        AnimalBuilder tiger = new AnimalBuilder.Builder().setSpeedRacing(100).setFlyable(false).build();
        AnimalBuilder dog = new AnimalBuilder.Builder().setSpeedRacing(60).setFlyable(false).build();
        AnimalBuilder eagle = new AnimalBuilder.Builder().setSpeedRacing(110).setFlyable(true).build();
        AnimalBuilder falcon = new AnimalBuilder.Builder().setSpeedRacing(140).setFlyable(true).build();
        AnimalBuilder snake = new AnimalBuilder.Builder().setSpeedRacing(55).setFlyable(false).build();

        List<AnimalBuilder> animals = Arrays.asList(horse,tiger,dog,eagle,falcon,snake);
        race(animals);

    }

    public static void race(List<AnimalBuilder> animals){
        int max=0;
        String animalName ="";
        for (AnimalBuilder animal : animals) {
            if(!animal.isFlyable()){
                System.out.println(animal.toString());
                if(max<animal.getSpeedRacing()) {
                    max=animal.getSpeedRacing();
                    animalName=animal.getClass().getSimpleName();
                }
            }
        }

        System.out.println("Winner is " + animalName + ", with speed: " + max);
    }

}

package lab_12_interface;

public class Fish extends Animal implements HasSwimable{
    @Override
    public void swimmable() {
        System.out.println(getClass().getSimpleName() + " can swim !");
    }
}

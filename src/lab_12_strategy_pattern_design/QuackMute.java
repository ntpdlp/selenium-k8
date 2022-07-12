package lab_12_strategy_pattern_design;

public class QuackMute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("no quack");
    }
}

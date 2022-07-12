package lab_12_strategy_pattern_design;

public class QuackQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}

package lab_12_strategy_pattern_design;

public class FlyNoWing implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("no fly");
    }
}

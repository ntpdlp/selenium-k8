package lab_12_strategy_pattern_design;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}

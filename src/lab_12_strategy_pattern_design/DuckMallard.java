package lab_12_strategy_pattern_design;

public class DuckMallard extends Duck{

    DuckMallard(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackQuack();
    }
}

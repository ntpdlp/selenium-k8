package lab_12_strategy_pattern_design;

public abstract class Duck {
    //phan chung, phan truu tuong
    protected QuackBehavior quackBehavior; // tai sao Protected => ah, tui muon con cua tui xai dc
    protected FlyBehavior flyBehavior;

    void quackPerform(){
        quackBehavior.quack();
    }

    void flyPerform(){
        flyBehavior.fly();
    }
}

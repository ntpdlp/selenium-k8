package lab_12_strategy_pattern_design;

public class DuckDecoy extends Duck{

    DuckDecoy(){
        this.flyBehavior = new FlyNoWing();
        this.quackBehavior = new QuackMute();
    }

}

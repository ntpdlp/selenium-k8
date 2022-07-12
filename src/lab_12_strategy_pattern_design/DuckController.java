package lab_12_strategy_pattern_design;

import java.util.Arrays;
import java.util.List;

public class DuckController {

    public static void main(String[] args) {
        List<Duck> duckList = Arrays.asList(new DuckMallard(), new DuckDecoy());
        for (Duck duck : duckList) {
            duck.quackPerform();
            duck.flyPerform();
        }
    }
}

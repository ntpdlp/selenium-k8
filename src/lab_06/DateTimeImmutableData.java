package lab_06;

import java.time.Duration;

public class DateTimeImmutableData {
    public static void main(String[] args) {

        //Wrapper of java.time: Duration
        System.out.println(Duration.ofSeconds(180)); //3M
        System.out.println(Duration.ofSeconds(130)); //2M10S

    }
}

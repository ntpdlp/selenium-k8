package lab_09;

import java.security.SecureRandom;

public class AnimalBuilder {
    private int speedRacing;
    private boolean flyable;
    AnimalBuilder(Builder builder){
        this.speedRacing = builder.speedRacing;
        this.flyable = builder.flyable;
    }

    public int getSpeedRacing() {
        return speedRacing;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "speedRacing=" + speedRacing +
                ", flyable=" + flyable +
                '}';
    }

    //builder
    public static  class  Builder{
        private int speedRacing;
        private boolean flyable;

        public Builder setSpeedRacing(int speed) {
            this.speedRacing = new SecureRandom().nextInt(speed);
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalBuilder build(){
            return new AnimalBuilder(this);
        }
    }
}

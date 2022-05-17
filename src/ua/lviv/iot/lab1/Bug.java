package ua.lviv.iot.lab1;

public record Bug(String name, int speedInMetersPerSecond, int weightInGrams, int age, boolean isFlying) {

    public Bug() {
        this("Fly", 10, 5);
    }

    public Bug(String name, int speedInMetersPerSecond, int weightInGrams) {
        this(name, speedInMetersPerSecond, weightInGrams, 1, false);
    }

    static int amountOfLegs = 6;

    static int getAmountOfLegs() {
        return amountOfLegs;
    }

    @Override
    public String toString() {
        return name + " " + speedInMetersPerSecond + " " + weightInGrams + " " + age + " " + isFlying;
    }

}

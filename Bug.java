public class Bug {
    private String name;
    private int speedInMetersPerSecond;
    private int weightInGrams;
    private static int age = 5;

    public Bug() {
        this("Fly",10,5);
    }

    public String toString() {
        return name + " " + speedInMetersPerSecond + " " + weightInGrams;
    }

    public Bug(String name, int speedInMetersPerSecond, int weightInGrams) {
        this.name = name;
        this.speedInMetersPerSecond = speedInMetersPerSecond;
        this.weightInGrams = weightInGrams;
    }

    public static int getAge() {
        return age;
    }

};


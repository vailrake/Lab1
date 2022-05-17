package ua.lviv.iot.lab1;

public class Main {

    public static void main(String[] args) {
        Bug fly = new Bug();
        Bug mosquito = new Bug("Mosquito", 15, 20);
        Bug spider = new Bug("Spider", 20, 100, 2, false);
        System.out.println(fly);
        System.out.println(mosquito);
        System.out.println(Bug.getAmountOfLegs() + " legs");
        System.out.println(spider);
    }
}

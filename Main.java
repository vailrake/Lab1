public class Main {

    public static void main(String[] args) {
        Bug fly = new Bug();
        Bug mosquito = new Bug("Mosquito", 15, 20);
        Bug spider = new Bug("Spider", 20, 100);
        System.out.println(fly);
        System.out.println(mosquito);
        System.out.println(Bug.getAge());
        System.out.println(spider);
    }
}

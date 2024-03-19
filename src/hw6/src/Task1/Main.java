package Task1;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Contoured", true);
        Swallow swallow = new Swallow("Filamentous", true);
        Penguin penguin = new Penguin("Downy", true);
        Kiwi kiwi = new Kiwi("Downy", true);

        eagle.fly();
        swallow.fly();
        penguin.fly();
        kiwi.fly();

        eagle.output();
        swallow.output();
        penguin.output();
        kiwi.output();
    }
}

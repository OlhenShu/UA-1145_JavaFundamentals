package Task1;

public class Main {
    public static void main(String[] args) {
       Bird[] bird = {  new Eagle("Contoured", true),
               new Swallow("Filamentous", true),
               new Penguin("Downy", true),
               new Kiwi("Downy", true) };

        for (int i = 0; i < bird.length; i++) {
            bird[i].output();
            bird[i].fly();
        }
    }
}

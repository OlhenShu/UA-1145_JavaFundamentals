package Project;

public class Ingredients {
    static Ingredients espresso = new Ingredients(250, 0, 16, 4);
    static Ingredients latte = new Ingredients(350, 75, 20, 7);
    static Ingredients cappuccino = new Ingredients(200, 100, 12, 6);
    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int price;

    public Ingredients(int water, int milk, int coffeeBeans, int price) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}

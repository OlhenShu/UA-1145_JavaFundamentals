package Project_Budjet_Manager;

import java.util.Locale;

public class Purchase {
    Category category;
    private String name;
    private double price;

    public Purchase(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s $%.2f", name, price);
    }
}

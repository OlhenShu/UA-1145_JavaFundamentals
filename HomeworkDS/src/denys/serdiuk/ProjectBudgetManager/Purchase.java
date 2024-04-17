package denys.serdiuk.ProjectBudgetManager;

import java.util.Objects;

public class Purchase {
    private String name;
    private String category;
    private double price;
    public Purchase(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(category, purchase.category);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(category);
    }

    @Override
    public String toString() {
        return name + " $" + price;
    }
}

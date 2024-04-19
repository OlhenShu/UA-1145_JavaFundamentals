package denys.serdiuk.homework13StreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String manufacturer;
    private String category;
    private LocalDate manufactureDate;
    private double price;

    public Product(String manufacturer, String category, LocalDate manufactureDate, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

	@Override
	public String toString() {
		return "Product [manufacturer=" + manufacturer + ", category=" + category + ", manufactureDate="
				+ manufactureDate + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, manufactureDate, manufacturer, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(manufactureDate, other.manufactureDate)
				&& Objects.equals(manufacturer, other.manufacturer)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}

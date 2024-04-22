import java.time.LocalDate;

class Product {
    private String manufacturer;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacturer, String category, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}

package Project_Budjet_Manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileManager {
    private final Path filePath;

    public FileManager(String fileName) {
        this.filePath = Path.of(fileName);
    }

    public void save(double balance, List<Purchase> purchases) throws IOException {
        Files.deleteIfExists(filePath);
        Files.createFile(filePath);

        String balanceLine = String.format(Locale.US, "Balance: %.2f%n", balance);
        Files.writeString(filePath, balanceLine, StandardOpenOption.APPEND);

        for (Purchase purchase : purchases) {
            String purchaseLine = String.format(Locale.US, "%s,%s,%.2f%n",
                    purchase.getCategory(),
                    purchase.getName(),
                    purchase.getPrice());
            Files.writeString(filePath, purchaseLine, StandardOpenOption.APPEND);
        }
    }

    public FileData load() throws IOException {
        if (!Files.exists(filePath)) {
            return new FileData(0.0, List.of());
        }

        List<String> lines = Files.readAllLines(filePath);
        if (lines.isEmpty()) {
            return new FileData(0.0, List.of());
        }

        double balance = 0.0;
        try {
            String balanceLine = lines.get(0);
            balance = Double.parseDouble(balanceLine.split(":")[1].trim());
        } catch (Exception e) {
            System.err.println("Error parsing balance: " + e.getMessage());
        }

        List<Purchase> purchases = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            try {
                String[] parts = lines.get(i).split(",");
                if (parts.length != 3) {
                    System.err.println("Invalid purchase data format: " + lines.get(i));
                    continue;
                }

                Category category = Category.valueOf(parts[0].toUpperCase());
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());

                purchases.add(new Purchase(name, price, category));
            } catch (Exception e) {
                System.err.println("Error parsing purchase data: " + e.getMessage());
            }
        }

        return new FileData(balance, purchases);
    }
}
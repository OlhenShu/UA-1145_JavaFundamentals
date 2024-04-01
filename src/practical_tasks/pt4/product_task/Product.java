package practical_tasks.pt4.product_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Product {
    private String name;
    private double price;
    private int quantity;
}

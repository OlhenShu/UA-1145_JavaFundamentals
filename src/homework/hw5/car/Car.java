package homework.hw5.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Car {
    private int yearOfProduction;
    private double engineCapacity;
    private CarType carType;
}

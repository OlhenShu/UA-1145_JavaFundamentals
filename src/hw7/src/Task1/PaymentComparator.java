package Task1;

import java.util.Comparator;

public class PaymentComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.calculatePay() - o2.calculatePay();
    }
}

package edu14.optional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CustomerService {
    private List<Customer> customerList;

    public CustomerService(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerList.stream()
                .filter(customer -> Objects.equals(customer.getId(), id))
                .findFirst();
    }
}

package edu14.optional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class DemoCustomer {
    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(new Customer(1L, "Adam"),
                new Customer(2L, "Bob"));
        CustomerService customerService = new CustomerService(customerList);

        Long searchId = 3L;

        Optional<Customer> customerOptional = customerService.findCustomerById(searchId);

        Customer customer = customerOptional.orElseThrow(
                () -> new NoSuchElementException("Customer with id" + searchId + " not found"));

        System.out.println(customer);
    }
}

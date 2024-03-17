package com.train.domen.service;

import com.train.domen.repository.CustomerRepository;
import com.train.domen.repository.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

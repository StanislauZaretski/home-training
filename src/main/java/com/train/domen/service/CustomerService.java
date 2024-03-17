package com.train.domen.service;

import com.train.domen.data.model.Order;
import com.train.domen.data.repository.CustomerRepository;
import com.train.domen.data.model.Customer;
import com.train.domen.data.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public List<Customer> getAllCustomers() {
        Iterable<Customer> customers = customerRepository.findAll();
        List<Customer> customerList = new ArrayList<>();
        customers.forEach(customerList::add);
        return customerList;
    }

    public void addCustomer(Customer customer){
        if (customer == null){
            throw new RuntimeException("Customer cannot be null");
        }
        this.customerRepository.save(customer);
    }

    public List<Order> getOrders(){
        Iterable<Order> orders = orderRepository.findAll();
        List<Order> orderList = new ArrayList<>();
        orders.forEach(orderList::add);
        return orderList;
    }
}

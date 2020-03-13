package org.fasttrackit.onlineshop.service;

import org.fasttrackit.onlineshop.persistence.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


}

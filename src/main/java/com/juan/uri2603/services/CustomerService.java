package com.juan.uri2603.services;

import com.juan.uri2603.dto.CustomerDto;
import com.juan.uri2603.dto.CustomerMinDto;
import com.juan.uri2603.entities.Customers;
import com.juan.uri2603.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Transactional(readOnly = true)
    public CustomerDto findById(long id) {
        Customers customerDto = customerRepository.findById(id).orElseThrow(()-> new RuntimeException());
        return new CustomerDto(customerDto);
    }

    @Transactional(readOnly = true)
    public List<CustomerMinDto> findByCity(String city) {
        List<CustomerMinDto> customerMinDtos = customerRepository.searchCity(city);
        return customerMinDtos;
    }
}

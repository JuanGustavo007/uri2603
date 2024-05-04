package com.juan.uri2603.controller;

import com.juan.uri2603.services.CustomerService;
import com.juan.uri2603.dto.CustomerDto;
import com.juan.uri2603.dto.CustomerMinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CustomerDto> getCustomerService(@PathVariable Long id) {
        CustomerDto customerDto = customerService.findById(id);
        return ResponseEntity.ok(customerDto);
    }

    @GetMapping
    public ResponseEntity<List<CustomerMinDto>> getCustomerCity(@RequestParam(value = "city", defaultValue = "") String city) {
        List<CustomerMinDto>  customerMinDtos = customerService.findByCity(city);
        return ResponseEntity.ok(customerMinDtos);
    }
}

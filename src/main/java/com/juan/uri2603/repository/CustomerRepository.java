package com.juan.uri2603.repository;

import com.juan.uri2603.dto.CustomerMinDto;
import com.juan.uri2603.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customers, Long> {

    @Query(value = "SELECT c FROM Customers c WHERE UPPER(c.city) = UPPER(:city) " )
    List<CustomerMinDto> searchCity(String city);
}

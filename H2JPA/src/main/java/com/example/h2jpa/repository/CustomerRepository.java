package com.example.h2jpa.repository;

import com.example.h2jpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    Optional<Customer> findById(Long id);
}

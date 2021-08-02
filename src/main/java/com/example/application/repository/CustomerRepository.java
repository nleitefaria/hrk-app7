package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

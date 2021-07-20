package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
package com.RESTful.RESTfulApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RESTful.RESTfulApp.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> { }

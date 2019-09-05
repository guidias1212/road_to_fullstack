package com.RESTful.RESTfulApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RESTful.RESTfulApp.model.Contact;
import com.RESTful.RESTfulApp.repository.ContactRepository;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

  private ContactRepository repository;

  ContactController(ContactRepository contactRepository) {
      this.repository = contactRepository;
  }

  // CRUD methods here
  
  @GetMapping
  public List findAll(){
    return repository.findAll();
  }
  
  @GetMapping(path = {"/{id}"})
  public ResponseEntity<Contact> findById(@PathVariable long id){
    return repository.findById(id)
    		.map(record -> ResponseEntity
    				.ok().body(record))
    		.orElse(ResponseEntity
    				.notFound().build());
  }
  
  @PostMapping
  public Contact create(@RequestBody Contact contact){
      return repository.save(contact);
  }
  
  @PutMapping(value="/{id}")
  public ResponseEntity<Contact> update(@PathVariable("id") long id,
                                        @RequestBody Contact contact){
    return repository.findById(id)
        .map(record -> {
            record.setName(contact.getName());
            record.setEmail(contact.getEmail());
            record.setPhone(contact.getPhone());
            Contact updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
  }
  
  @DeleteMapping(path ={"/{id}"})
  public ResponseEntity<?> delete(@PathVariable("id") long id) {
    return repository.findById(id)
        .map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
  }
}

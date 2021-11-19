package com.SriRam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SriRam.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}

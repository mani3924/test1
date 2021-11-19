package com.SriRam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SriRam.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}

package com.SriRam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SriRam.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}

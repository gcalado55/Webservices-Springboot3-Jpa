package com.gcalado.webspring.services;

import com.gcalado.webspring.entities.Order;
import com.gcalado.webspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
     return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderObj = repository.findById(id);
        return orderObj.get();
    }

}

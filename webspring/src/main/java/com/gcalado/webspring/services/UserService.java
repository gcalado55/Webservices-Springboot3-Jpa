package com.gcalado.webspring.services;

import com.gcalado.webspring.entities.User;
import com.gcalado.webspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
     return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> userObj = repository.findById(id);
        return userObj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

}

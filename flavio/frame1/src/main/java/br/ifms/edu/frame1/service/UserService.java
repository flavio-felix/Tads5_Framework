package br.ifms.edu.frame1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifms.edu.frame1.model.User;
import br.ifms.edu.frame1.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){

        return this.userRepository.findAll();
    }


    
}

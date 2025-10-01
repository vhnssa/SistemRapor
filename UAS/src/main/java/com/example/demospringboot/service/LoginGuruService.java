package com.example.demospringboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.LoginGuru;
import com.example.demospringboot.repository.LoginGuruRepository;  

@Service
public class LoginGuruService {

    @Autowired
    private LoginGuruRepository loginRepositoryGuru; 


    public List<LoginGuru> getAllLogin() {
        return loginRepositoryGuru.findAll();
    }

   
    public LoginGuru getLoginByUsername(String username) {
        return loginRepositoryGuru.findByUsername(username);
    }

    
    public LoginGuru addLogin(LoginGuru login) {
        return loginRepositoryGuru.save(login);
    }

   
    public LoginGuru updateLogin(String username, LoginGuru login) {
        
        return loginRepositoryGuru.save(login);
    }

   
}

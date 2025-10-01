package com.example.demospringboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.LoginSiswa; 
import com.example.demospringboot.repository.LoginSiswaRepository;  // Fixed the repository name to follow naming conventions

@Service
public class LoginSiswaService {

    @Autowired
    private LoginSiswaRepository loginRepositorySiswa;  


    public List<LoginSiswa> getAllLogin() {
        return loginRepositorySiswa.findAll();
    }

  
    public LoginSiswa getLoginByUsername(String username) {
        return loginRepositorySiswa.findByUsername(username);
    }

    
    public LoginSiswa addLogin(LoginSiswa login) {
        return loginRepositorySiswa.save(login);
    }

    
    public LoginSiswa updateLogin(String username, LoginSiswa login) {

        return loginRepositorySiswa.save(login);  
    }


}

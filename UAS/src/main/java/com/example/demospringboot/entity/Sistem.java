package com.example.demospringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public abstract class Sistem {
    
    @Id
    private String username;
    private String password;


    public Sistem(String username, String password) {
        this.username = username;
    }

  
    public void masuk() {
        System.out.println("Berhasil Login!");
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;  
    }


    public void setPassword(String password) {
        this.password = password; 
    }

    public String getPassword() {
        return password;  
    }
}



package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.Prestasi;
import com.example.demospringboot.repository.PrestasiRepository;
import java.util.List;

@Service
public class PrestasiService {

    @Autowired
    private PrestasiRepository prestasiRepository;

    public void addPrestasi(Prestasi prestasi) {
        
        prestasiRepository.save(prestasi);
    }
    

    public List<Prestasi> getAllPrestasi() {
        return prestasiRepository.findAll(); 
    }
}

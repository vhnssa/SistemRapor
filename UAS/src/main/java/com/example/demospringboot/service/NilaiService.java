package com.example.demospringboot.service;

import com.example.demospringboot.entity.Nilai;
import com.example.demospringboot.repository.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NilaiService {

    @Autowired
    private NilaiRepository nilaiRepository;

    // Ambil semua data nilai
    public List<Nilai> getAllNil() {
        return nilaiRepository.findAll();
    }

    // Ambil nilai berdasarkan NISN
    public Nilai getNilByNisn(int nisn) {
        return nilaiRepository.findByNisn(nisn).orElse(null);
    }

    // Ambil nilai berdasarkan nama
    public List<Nilai> getNilByNama(String nama) {
        return nilaiRepository.findByNama(nama);
    }

    // Tambah nilai baru
    public Nilai addNil(Nilai nilai) {
        return nilaiRepository.save(nilai);
    }

    // Update nilai berdasarkan NISN
    public Nilai updateNil(int nisn, Nilai nilai) {
        nilai.setNisn(nisn);
        return nilaiRepository.save(nilai);
    }

    // Hapus nilai berdasarkan NISN
    public void deleteNil(int nisn) {
        nilaiRepository.deleteByNisn(nisn);
    }

    // Simpan nilai (digunakan untuk tambah atau update)
    public Nilai saveNilai(Nilai nilai) {
        return nilaiRepository.save(nilai);
    }
}

package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.Siswa;
import com.example.demospringboot.repository.SiswaRepository;
import java.util.List;

@Service
public class SiswaService {
@Autowired
private SiswaRepository siswaRepository;
public List<Siswa> getAllSis() {
return siswaRepository.findAll();
}
public Siswa getSisByNisn(int nisn) {
return siswaRepository.findByNisn(nisn).orElse(null);
}
public Siswa addSis(Siswa sis) {
return siswaRepository.save(sis);
}
public Siswa updateSis(int nisn, Siswa sis) {
sis.setNisn(nisn);
return siswaRepository.save(sis);
}
public void deleteSis(int nisn) {
siswaRepository.deleteByNisn(nisn);
}
}
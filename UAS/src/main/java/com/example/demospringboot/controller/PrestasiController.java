package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demospringboot.entity.Prestasi;
import com.example.demospringboot.service.PrestasiService;
import java.util.List;

@Controller
public class PrestasiController {

    @Autowired
    private PrestasiService prestasiService;

    @GetMapping("/inputprestasi")
    public String prestasiPage(Model model) {
        model.addAttribute("prestasiInfo", new Prestasi());  // Prepare a new Prestasi object
        return "inputprestasi";  // Return the form page
    }

    @GetMapping("/daftarprestasi")
    public String daftarPrestasiPage(Model model) {
        List<Prestasi> prestasiList = prestasiService.getAllPrestasi();  // Fetch all records
        model.addAttribute("prestasiList", prestasiList);  // Add to model to display
        return "daftarprestasi";  // Return the list page
    }

    @PostMapping("/submitprestasi")
    public String prestasiAdd(@ModelAttribute("prestasiInfo") Prestasi prestasiInfo, Model model) {
        prestasiService.addPrestasi(prestasiInfo);  // Save the new record
        return "redirect:/daftarprestasi";  // Redirect to the page showing all records
    }
}

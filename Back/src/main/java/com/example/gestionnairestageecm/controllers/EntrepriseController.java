package com.example.gestionnairestageecm.controllers;

import java.util.List;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gestionnairestageecm.models.Entreprise;
import com.example.gestionnairestageecm.services.EntrepriseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RequestMapping("/api/v1/entreprises")
@RestController
@AllArgsConstructor
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/list")
    public List<Entreprise> getAllEntreprises() {
        return entrepriseService.getAllEntreprises();
    }

    @GetMapping("/id={siretNumber}")
    public Entreprise getEntrepriseById(@PathVariable Long siretNumber) {
        return entrepriseService.getEntrepriseById(siretNumber);
    }

    @PostMapping("/new")
    public Entreprise saveEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.saveEntreprise(entreprise);
    }

    @PutMapping("/update/id={siretNumber}")
    public Entreprise updateEntreprise(@PathVariable Long siretNumber, @RequestBody Entreprise newEntreprise) {
        return entrepriseService.updateEntreprise(siretNumber, newEntreprise);
    }

    @DeleteMapping("/delete/id={siretNumber}")
    public void deleteEntreprise(@PathVariable Long siretNumber) {
        entrepriseService.deleteEntreprise(siretNumber);
    }
    
}

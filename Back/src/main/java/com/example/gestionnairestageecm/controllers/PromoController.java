package com.example.gestionnairestageecm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gestionnairestageecm.models.Promo;
import com.example.gestionnairestageecm.services.PromoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/promos")
public class PromoController {
    
    @Autowired
    private final PromoService promoService;
    
    @GetMapping("/list")
    public List<Promo> getAllPromos() {
        return promoService.getAllPromos();
    }

    @GetMapping("/year={year}")
    public Promo getPromoByYear(int year) {
        return promoService.getPromoByYear(year);
    }

    @PostMapping("/new")
    public Promo savePromo(Promo promo) {
        return promoService.savePromo(promo);
    }

    @PutMapping("/update/year={year}")
    public Promo updatePromo(int year, Promo newPromo) {
        return promoService.updatePromo(year, newPromo);
    }

    @DeleteMapping("/delete/year={year}")
    public void deletePromo(Long promoId) {
        promoService.deletePromo(promoId);
    }
}

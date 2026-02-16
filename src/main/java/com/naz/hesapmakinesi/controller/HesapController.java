package com.naz.hesapmakinesi.controller;

import com.naz.hesapmakinesi.dto.Sayilar;
import com.naz.hesapmakinesi.service.HesapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HesapController {

    private final HesapService servis; // Servisi cağırır

    // Toplama için
    @PostMapping("/topla")
    public double t(@RequestBody Sayilar veri) {
        return servis.topla(veri.getSayiListesi());
    }

    // Çıkarma için
    @PostMapping("/cikar")
    public double c(@RequestBody Sayilar veri) {
        return servis.cikar(veri.getSayiListesi());
    }

    // Çarpma için
    @PostMapping("/carp")
    public double cr(@RequestBody Sayilar veri) {
        return servis.carp(veri.getSayiListesi());
    }

    // Bölme için
    @PostMapping("/bol")
    public double b(@RequestBody Sayilar veri) {
        return servis.bol(veri.getSayiListesi());
    }
}
package com.naz.hesapmakinesi.controller;

import com.naz.hesapmakinesi.dto.Kisi;
import com.naz.hesapmakinesi.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kisi") // Adresimizi belirledik burda localhost api kisi
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;

    // Veri istemek için GET kullandık
    @GetMapping("/getir")
    public Kisi kisiGetir() {
        return kisiService.sabitKisiDondur();
    }
}
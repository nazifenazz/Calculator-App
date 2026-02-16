package com.naz.hesapmakinesi.service;

import com.naz.hesapmakinesi.dto.Kisi;
import org.springframework.stereotype.Service;

@Service // Spring'e bunun bir servis olduğunu söyler
public class KisiService {

    public Kisi sabitKisiDondur() {

        return new Kisi("Eymen Naz", "Coskun", 23, "Bilgisayar Muhendisi");
    }
}
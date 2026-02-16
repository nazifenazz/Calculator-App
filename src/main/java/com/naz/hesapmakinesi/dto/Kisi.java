package com.naz.hesapmakinesi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter ve Setter'ları otomatik yapar
@AllArgsConstructor // Parametreli constructor
@NoArgsConstructor // Boş constructor
public class Kisi {
    private String ad;
    private String soyad;
    private int yas;
    private String meslek;
}
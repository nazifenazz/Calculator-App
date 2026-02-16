package com.naz.hesapmakinesi.dto;

import lombok.Data;
import java.util.List;

@Data
public class Sayilar {
    private List<Double> sayiListesi; // Sonsuz sayı almayı sağlar
}
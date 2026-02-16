package com.naz.hesapmakinesi.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HesapService {

    // Listedeki tüm sayıları toplar
    public double topla(List<Double> liste) {
        double toplam = 0;
        for (Double sayi : liste) {
            toplam = toplam + sayi;
        }
        return toplam;
    }

    // İlk sayıdan diğer tüm sayıları  çıkarır
    public double cikar(List<Double> liste) {
        double sonuc = liste.get(0); // İlk sayıyı başlangıç seçiyoruz
        for (int i = 1; i < liste.size(); i++) {
            sonuc = sonuc - liste.get(i); // Sıradaki sayıları çıkarıyoruz
        }
        return sonuc;
    }

    // Listedeki  sayıları birbiriyle çarpar
    public double carp(List<Double> liste) {
        double sonuc = 1;
        for (Double sayi : liste) {
            sonuc = sonuc * sayi;
        }
        return sonuc;
    }

    // İlk sayıyı diğer sayılara sırayla böler
    public double bol(List<Double> liste) {
        double sonuc = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) != 0) { // Sıfıra bölme hatasını engeller
                sonuc = sonuc / liste.get(i);
            }
        }
        return sonuc;
    }
}
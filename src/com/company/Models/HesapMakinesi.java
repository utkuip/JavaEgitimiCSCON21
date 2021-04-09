package com.company.Models;

import com.company.Interfaces.HesapFonksiyonlari;

public abstract class HesapMakinesi implements HesapFonksiyonlari {


    @Override
    public int toplamaIslemi(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    @Override
    public int cikarmaIslemi(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    @Override
    public double bolmeIslemi(int sayi1, int sayi2) {
        return (double)sayi1 / sayi2 ;
    }

    @Override
    public int carpmaIslemi(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
}

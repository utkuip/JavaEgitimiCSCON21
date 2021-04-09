package com.company.Models;

public class AgacModel extends CanliModel {
    int ID;
    String agacTur;
    String yaprakRengi;
    String govdeKalinligi;
    String kokUzunlugu;
    boolean dalVarMi;
    String meyve;
    String agacAdi;

    @Override
    public void nefesAl(){
        System.out.println("Karbondioksit alıp oksijen verdim");
    }

    @Override
    public void beslen() {
        System.out.println("Topraktan mineral aldım");
    }

}

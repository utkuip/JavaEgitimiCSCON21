package com.company.Models;

public class InsanModel extends MemeliModel {

    int tcKimlikNo;
    String isim;
    String sacRengi;
    int yas;

    public InsanModel(){
        this.yas = 0;
    }

    public InsanModel(String isim){
        this.isim = isim;
        this.yas = 0;
    }

    @Override
    public void nefesAl(){
        System.out.println("Oksijen alıp karbondioksit verdim");
    }

    @Override
    public void beslen() {
        System.out.println("Patates yedim");
    }

    public void setTcKimlikNo(int tc){
        if(tc != 000){
            this.tcKimlikNo = tc;
        }else {
            System.out.println("Yanlış TC Kimlik No girdiniz!");
        }

    }

    public int getTcKimlikNo(){
        return tcKimlikNo;
    }

    public String getIsim(){
        return this.isim;
    }

}

package com.company;


import com.company.Models.Islem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Islem islem = new Islem();

        islem.bolme = islem.bolmeIslemi(10,8);
        islem.toplam = islem.toplamaIslemi(7,3);
        islem.carpim = islem.carpmaIslemi(9,135);
        islem.cikartma = islem.cikarmaIslemi(27, 4);

        System.out.println(islem.bolme + " " + islem.cikartma +" "+ islem.carpim + " " + islem.toplam);
    }


}
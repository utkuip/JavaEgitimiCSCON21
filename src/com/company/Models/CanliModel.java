package com.company.Models;

import com.company.Interfaces.CanliFonksiyonları;
import com.company.Interfaces.MemeliFonksiyonlari;

public abstract class CanliModel implements CanliFonksiyonları, MemeliFonksiyonlari {



    public void ure(){
        System.out.println("Üredim");
    }
}

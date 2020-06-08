/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veriler;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cetin
 */
public abstract class Veri implements Serializable{
    protected int test;
    protected int vaka;
    protected int vefat;
    protected int iyilesen;
    protected int yogunBakim;
    protected int entube;
    
    protected Date tarih;
    
    
    public int getTest() {
        return test;
    }

    
    public abstract void setTest(int test);
      
    
    public int getVaka() {
        return vaka;
    }

    public abstract void setVaka(int gunlukVaka);
     
    
    public int getVefat() {
        return vefat;
    }

    public abstract void setVefat(int vefat);
    
    public int getIyilesen() {
        return iyilesen;
    }

    public abstract void setIyilesen(int iyilesen);
   
    public int getYogunBakim() {
        return yogunBakim;
    }

    
    public abstract void setYogunBakim(int yogunBakim);

    
    public int getEntube() {
        return entube;
    }

    
    public abstract void setEntube(int entube);
   
    public Date getTarih() {
        return tarih;
    }

    
    public abstract void setTarih(Date tarih);
    
}

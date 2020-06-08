/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veriler;

import Veriler.Veri;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cetin
 */
public class BosVeri extends Veri{

    public BosVeri(){
        entube = iyilesen = test = vaka = vefat = yogunBakim  = 0;
        tarih = new Date();
    }
    
    
    @Override
    public void setTest(int gunlukTest) {
        this.test = 0;
    }

    @Override
    public void setVaka(int gunlukVaka) {
      this.vaka = 0;
    }

    @Override
    public void setVefat(int gunlukVefat) {
       this.vefat  = 0;
    }

    @Override
    public void setIyilesen(int gunlukIyilesen) {
     this.iyilesen  = 0;
    }

    @Override
    public void setYogunBakim(int gunlukYogunBakim) {
       this.yogunBakim  = 0;
    }

    @Override
    public void setEntube(int gunlukEntube) {
       this.entube  = 0;
    }

    @Override
    public void setTarih(Date gunlukTarih) {
       this.tarih  = new Date();
    }
    
}

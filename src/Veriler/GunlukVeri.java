/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veriler;

import Veriler.Veri;
import java.util.*;

/**
 *
 * @author cetin
 */
public class GunlukVeri extends Veri {

    public GunlukVeri() {
        test = vaka = iyilesen = entube = yogunBakim = vefat = 0;
    }

    @Override
    public void setTest(int test) {
        this.test = test >= 0 ? test : 0;

    }

    @Override
    public void setVaka(int vaka) {
        this.vaka = vaka >= 0 ? vaka : 0;
    }

    @Override
    public void setVefat(int vefat) {
        this.vefat = vefat >= 0 ? vefat : 0;
    }

    @Override
    public void setIyilesen(int iyilesen) {
        this.iyilesen = iyilesen >= 0 ? iyilesen : 0;
    }

    @Override
    public void setYogunBakim(int yogunBakim) {
        this.yogunBakim = yogunBakim >= 0 ? yogunBakim : 0;
    }

    @Override
    public void setEntube(int entube) {
        this.entube = entube >= 0 ? entube : 0;
    }

    @Override
    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

}

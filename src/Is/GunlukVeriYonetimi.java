/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is;

import VeriErisim.Abstracts.GunlukVeriDal;
import Veriler.Veri;


public class GunlukVeriYonetimi {
    
    private GunlukVeriDal gunlukVeriDal;
    
    public GunlukVeriYonetimi(GunlukVeriDal gunlukVeriDal){
        this.gunlukVeriDal = gunlukVeriDal;
    }
    
    
    public void ekle(Veri gunlukVeri){
        gunlukVeriDal.ekle(gunlukVeri);
    }
    
    public Veri sonVeriGetir(){
        return gunlukVeriDal.sonVeriGetir();
    }
    
    
}

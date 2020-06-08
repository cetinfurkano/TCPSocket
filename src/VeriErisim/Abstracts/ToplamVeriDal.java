/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeriErisim.Abstracts;

import Veriler.Veri;

import java.util.Vector;

/**
 *
 * @author cetin
 */
public interface ToplamVeriDal extends DosyaIslemi<Veri> {
    
    public Vector<Veri> hepsiniGetir(); 
    

}
     


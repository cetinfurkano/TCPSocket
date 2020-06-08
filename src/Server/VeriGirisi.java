package Server;

import java.io.*;
import java.util.Date;
import java.util.Vector;
import java.io.Serializable;

public class VeriGirisi{

    private boolean veriGirildiMi;
    
    private Vector<Observer> observers;
    
    public VeriGirisi(){
        observers = new Vector<>();
        
    }
  
    public void setVeriGirildiMi(boolean veriGirildiMi){
        this.veriGirildiMi = veriGirildiMi;
        if(veriGirildiMi){
            Notify();
            veriGirildiMi = false;
        }
    }
    
    public void aboneEkle(Observer observer){
        observers.add(observer);
    }
     public void aboneCikar(Observer observer){
        observers.remove(observer);
    }
 
    public void Notify(){
       
        for(Observer o : observers){
           if(!o.update()){
               aboneCikar(o);
           }
       }
       
    }

}

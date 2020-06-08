package VeriErisim;

import VeriErisim.Abstracts.GunlukVeriDal;
import Veriler.BosVeri;
import Veriler.GunlukVeri;
import Veriler.Veri;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class TxtGunlukVeriDal implements GunlukVeriDal {

    
    private SimpleDateFormat formatter;
    private Veri veri;
    
    private String dosyaAdi;
    
    public TxtGunlukVeriDal(String dosyaAdi) {
        formatter = new SimpleDateFormat("d-MMMM-yyyy");
        this.dosyaAdi = dosyaAdi +".txt";
    }
    
    

    @Override
    public void ekle(Veri veri) {
         var veriString = stringDonustur(veri);

        try {
            File file = new File(dosyaAdi);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter wr = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(wr);
            
            for (int i = 0; i < veriString.length; i++) {
                bw.write(veriString[i] + " ");
            }
            bw.newLine();
            
            bw.close();
        } catch (Exception e) {
        }
    }

    @Override
    public Veri sonVeriGetir() {
       var deger = hepsiniGetir();
       if(deger.size() > 0){
           return deger.lastElement();
       }
       return new BosVeri();
    }
    
    private String[] stringDonustur(Veri veri) {
        String[] veriString = new String[7];
        veriString[0] = String.valueOf(veri.getTest());
        veriString[1] = String.valueOf(veri.getVaka());
        veriString[2] = String.valueOf(veri.getVefat());
        veriString[3] = String.valueOf(veri.getIyilesen());
        veriString[4] = String.valueOf(veri.getYogunBakim());
        veriString[5] = String.valueOf(veri.getEntube());
        veriString[6] = formatter.format(veri.getTarih());
        

        return veriString;
    }

     
    private Vector<Veri> hepsiniGetir() {
        Vector<Veri> veriler = new Vector<Veri>();

        try {
            File file = new File(dosyaAdi);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader reader = new FileReader(file);
            BufferedReader in = new BufferedReader(reader);
            String oku;
            while ((oku = in.readLine()) != null) {
                String dizi[] = oku.split(" ");
                veriDonustur(dizi);
                veriler.add(veri);
            }
            in.close();
        } catch (Exception e) {
        }

        return veriler;
    }
    
    
     private void veriDonustur(String[] gelenVeri) {
        veri = new GunlukVeri();
        veri.setTest(Integer.valueOf(gelenVeri[0]));
        veri.setVaka(Integer.valueOf(gelenVeri[1]));
        veri.setVefat(Integer.valueOf(gelenVeri[2]));
        veri.setIyilesen(Integer.valueOf(gelenVeri[3]));
        veri.setYogunBakim(Integer.valueOf(gelenVeri[4]));
        veri.setEntube(Integer.valueOf(gelenVeri[5]));
       
        try {
            veri.setTarih(formatter.parse(gelenVeri[6]));
        } catch (Exception e) {
        }
        
    }
     
}

package Is;

import VeriErisim.Abstracts.ToplamVeriDal;
import Veriler.BosVeri;
import Veriler.Veri;
import java.util.Vector;

public class ToplamVeriYonetimi {

    private ToplamVeriDal toplamVeriDal;

    private static Veri toplamVeri;

    public ToplamVeriYonetimi(ToplamVeriDal toplamVeriDal) {
        this.toplamVeriDal = toplamVeriDal;
    }

    public Vector<Veri> hepsiniGetir() {
        return toplamVeriDal.hepsiniGetir();

    }

    public void ekle(Veri toplamVeri) {
        toplamVeriDal.ekle(toplamVeri);
    }

    public Veri sonVeriGetir() {
        toplamVeri = toplamVeriDal.sonVeriGetir();
        return toplamVeri;
    }

    public void Hesapla(Veri gunlukVeri) {
        toplamVeri.setEntube(toplamVeri.getEntube() + gunlukVeri.getEntube());
        toplamVeri.setIyilesen(toplamVeri.getIyilesen() + gunlukVeri.getIyilesen());
        toplamVeri.setYogunBakim(toplamVeri.getYogunBakim() + gunlukVeri.getYogunBakim());
        toplamVeri.setTest(toplamVeri.getTest() + gunlukVeri.getTest());
        toplamVeri.setVefat(toplamVeri.getVefat() + gunlukVeri.getVefat());
        toplamVeri.setVaka(toplamVeri.getVaka() + gunlukVeri.getVaka());
        toplamVeri.setTarih(gunlukVeri.getTarih());
    }

    public void setToplamVeri(Veri veri) {
        toplamVeri = veri;
    }

}

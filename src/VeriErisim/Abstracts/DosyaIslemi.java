
package VeriErisim.Abstracts;

import java.util.Date;
import java.util.Vector;

public interface DosyaIslemi<T> {
    
    public void ekle(T veri);
    public T sonVeriGetir();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nhan
 */
public class TiGia 
{
    float tigia;
    List<OnTiGiaThayDoiListerner> Observer = new ArrayList<>();

    public TiGia(float tigia) {
        this.tigia = tigia;
    }
    
    public void DangKY(OnTiGiaThayDoiListerner listerner)
    {
        if(!Observer.contains(listerner))
            Observer.add(listerner);
        listerner.capNhatTiGia(tigia);
    }
    public void HuyDangKy(OnTiGiaThayDoiListerner listerner)
    {
        if(Observer.contains(listerner))
            Observer.remove(listerner);
    }
    public  void ThayDoi(float deita)
    {
        tigia +=deita;
        for(OnTiGiaThayDoiListerner listerner: Observer)
        {
            listerner.capNhatTiGia(tigia);
        }
    }
    public  static  interface OnTiGiaThayDoiListerner
    {
        public void capNhatTiGia(float TiGiaMoi);
    }
}

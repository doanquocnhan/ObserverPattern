/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt2;

/**
 *
 * @author Nhan
 */
public class NhaDauTuA implements TiGia.OnTiGiaThayDoiListerner{

    float tigia;
    boolean dangky;
//    TiGia dichVu;
//
//    public NhaDauTuA(float tigia) {
//        this.tigia = tigia;
//    }
    
    public void dangKy(TiGia dichVu)
    {
        dichVu.DangKY(this);
    }
    public  void huydangKy(TiGia dichVu)
    {
        dichVu.HuyDangKy(this);
        dangky = false;
    }
    @Override
    public void capNhatTiGia(float TiGiaMoi) {
        if(dangky)
        {    
        if(TiGiaMoi>tigia)
            System.out.println("Nha Dau Tu A: Ban Ra");
        else
            if(TiGiaMoi==tigia)
                System.out.println("Nha Dau Tu A: Ban ra It");
        else
            System.out.println("Nha Dau tu A: Mua vao");
        
        tigia=TiGiaMoi;
        }
        else
        {
            dangky=true;
        tigia=TiGiaMoi;
        }
    }
    
    
}

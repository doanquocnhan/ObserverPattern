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
public class NhaDauTuB implements TiGia.OnTiGiaThayDoiListerner{

    float tigia;
    
    boolean dangky;
//    TiGia dichVu;
//    public NhaDauTuB(float tigia) {
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
                System.out.println("Nha Dau Tu B: Mua vao");
            else
                if(TiGiaMoi==tigia)
                    System.out.println("Nha Dau Tu B: Ban ra");
            else
                System.out.println("Nha Dau Tu B: Ban Het");

            tigia=TiGiaMoi;
       }
       else
       {
            dangky = true;
            tigia=TiGiaMoi;
       }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt2;

import java.util.Scanner;

/**
 *
 * @author Nhan
 */
public class Observerpattern59CNTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TiGia dichVu = new TiGia(100);
       NhaDauTuA a = new NhaDauTuA();
       NhaDauTuB b = new NhaDauTuB();
       a.dangKy(dichVu);
       b.dangKy(dichVu);
       while(true)
       {
           Scanner scanner = new Scanner(System.in);         // Khong chay duoc
           float tigia = 0;
           System.out.println("Nhap ti gia:");
           tigia = scanner.nextFloat();
           dichVu.ThayDoi(tigia);
           System.out.println("Tiep tuc: Y/N");
           String xacnhan;
           xacnhan= scanner.next();
           if(xacnhan.equalsIgnoreCase("n"))
               break;
       }
    }
    
}

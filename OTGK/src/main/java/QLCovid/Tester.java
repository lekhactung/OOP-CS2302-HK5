/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class Tester {

    public static void main(String[] args) {
        NguoiDan n1 = new NguoiDan("01", "Le Khac Tung", GioiTinh.NAM, "01234", "07/10/2005");
        NguoiDan n2 = new NguoiNuocNgoai("NG01", "Nauy", "Le Khac Tung", GioiTinh.NAM, "01234", "07/10/2005");
        Vaccine v1 = new Vaccine( "Polyfier", "USA", 100);
        Vaccine v2 = new Vaccine( "Azfar", "USA", 100);
        Vaccine v3 = new Vaccine( "Polyfier", "USA", 100);
        Vaccine v4 = new Vaccine( "Azfar", "USA", 100);
        
        QLTiemChung ql = new QLTiemChung();
        ql.themNguoiDan(n1, n2);
//        ql.hienThiNguoiDan();
        ql.themVaccine(v1,v2,v3,v4);
//        ql.hienThiVaccine();  
//        ql.tiemChung(n2, v1, "HCM");
        ql.hienThiNguoiDan();
        
    }
}

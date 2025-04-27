/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLGiangVien;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        GiangVien gv1 = new GiangVienCoHuu("Tung",
                 "07/10/2005",
                 "Giao Su",
                 "Tien si",
                 60,
                 500000,
                 2);
        GiangVien gv2 = new GiangVienThinhGiang("Triet",
                 "11/11/2005",
                 "P.Giao Su",
                 "Thac si",
                 50
                , "Dong Nai");
        GiangVien gv3 = new GiangVienCoHuu("Huy"
                , "26/11/2005"
                , "P.Giao Su"
                , "Tien si"
                , 15
                , 900000
                , 3);
        QLGV ds = new QLGV();
        ds.themGV(gv1, gv2, gv3);
        ds.hienThi();
        System.out.println("///////////////\n");
        ds.tinhLuong().forEach(g -> g.hienThi());
//        ds.hienThi();
    }
}

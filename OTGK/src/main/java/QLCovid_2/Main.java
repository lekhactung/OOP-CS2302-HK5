/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid_2;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class Main {

    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("VC01", "USA", 10);
        Vaccine v2 = new Vaccine("VC02", "Russia", 10);
        Vaccine v3 = new Vaccine("VC03", "France", 10);
        Vaccine v4 = new Vaccine("VC04", "China", 10);

        NguoiDan_2 n1 = new NguoiDan_2("01", "Tung", GioiTinh.NAM, "0123", "07/10/2005");
        NguoiDan_2 n2 = new NguoiNuocNgoai("02", "Triet", GioiTinh.NAM, "0234", "11/02/2005", "NG01", "USA");
        NguoiDan_2 n3 = new NguoiDan_2("03", "Huy", GioiTinh.NU, "0345", "07/12/2005");
        NguoiDan_2 n4 = new NguoiNuocNgoai("04", "Duc", GioiTinh.NAM, "0456", "23/09/2005", "NG02", "Japan");
        //a
        System.out.println("======a)======");
        QLTiemChung_2 ql = new QLTiemChung_2();
        ql.themVaccine(v1, v2, v3, v4);
        ql.hienThiVaccine();
        //b
        System.out.println("======b)======");
        ql.themNguoiDan(n1, n2, n3, n4);
        ql.hienThiNguoiNuocNgoai();
        //c
        System.out.println("======c)======");
        ql.themMuiTiem(n2, v4, "HCM");
        ql.themMuiTiem(n1, v4, "HCM");
        ql.themMuiTiem(n1, v4, "HCM");
        ql.themMuiTiem(n1, v4, "HCM");
        //d 
        System.out.println("======d)======");
        ql.hienThiThongTinTiemChung();
        //e
        System.out.println("======e)======");
        ql.kiemTraDKTiemChungNguoiDan("Triet");
    }
}

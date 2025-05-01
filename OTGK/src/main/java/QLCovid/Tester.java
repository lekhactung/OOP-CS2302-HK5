/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author LE TUNG
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiDan n1 = new NguoiDan("01", "Le Khac Tung", GioiTinh.NAM, "01234", "07/10/2005");
        NguoiDan n2 = new NguoiNuocNgoai("NG01", "Nauy", "Tran Minh Triet", GioiTinh.NAM, "01234", "26/11/2005");
        NguoiDan n3 = new NguoiNuocNgoai("NG02", "USA", "Hoang Huy", GioiTinh.NAM, "01234", "10/11/2005");
        NguoiDan n4 = new NguoiNuocNgoai("NG04", "UK", "Minh Duc", GioiTinh.NU, "01234", "04/10/2005");

        Vaccine v1 = new Vaccine("Polyfier", "USA", 100);
        Vaccine v2 = new Vaccine("Azfar", "France", 100);
        Vaccine v3 = new Vaccine("Polyfier", "Russia", 100);
        Vaccine v4 = new Vaccine("Azfar", "Korean", 100);

        QLTiemChung ql = new QLTiemChung();
        ql.themNguoiDan(n1, n2, n4);
//        ql.hienThiNguoiDan();
        ql.themVaccine(v1, v2, v3, v4);
        System.out.println("----a) ----");
        ql.hienThiVaccine();
        System.out.println("----b) ----");
        ql.dsNguoiNuocNgoai().forEach(n -> n.hienThi());
        System.out.println("----c) ----");

        System.out.println("----e) ----");
        ql.tiemChung(n1, v1, "HCM");
        ql.tiemChung(n1, v1, "HCM");
//        ql.tiemChung(n1, v1, "HCM");
//        ql.tiemChung(n1, v1, "HCM");

        System.out.println("Nhap nguoi can kiem tra : ");
        String name = sc.nextLine();
        ql.timKiem(name);

        System.out.println("----d) ----");
        System.out.println("----f) ----");

//        ql.tiemChung(n2, v1, "HCM");
//        ql.tiemChung(n2, v2, "HCM");
//        ql.tiemChung(n2, v3, "HCM");
//        ql.tiemChung(n2, v4, "HCM");
//        ql.hienThiNguoiDan();
    }
}

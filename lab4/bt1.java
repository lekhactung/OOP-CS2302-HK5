/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

/**
 *
 * @author admin
 */
public class bt1 {

    public static void main(String[] args) throws ClassNotFoundException {
        QLHinh ql = new QLHinh();
        ql.themHinh(new TamGiac("TG", 30, 40, 50));
        ql.themHinh(new TamGiacCan("TG", 35, 45));
        ql.themHinh(new TamGiacDeu("TG", 45));
        ql.themHinh(new HinhChuNhat("HCN", 45, 60));
        ql.themHinh(new HinhVuong("HCN", 40));
//        ql.hienThi();

//        System.out.println("===TIM KIEM===");
//        ql.timKiem("com.mycompany.lab4.HinhChuNhat").forEach(h -> System.out.println(h));
//        System.out.println("===ASC SORT===");
//        ql.sapXep();
//        ql.hienThi();
//        System.out.println("===DESC SORT===");
//        ql.sapXepGiamDan();
//        ql.hienThi();
//        System.out.println("===XOA===");
//        ql.xoaHinh("TG");
//        ql.hienThi();
//        System.out.println("===DIEN TICH TB===");
//        System.out.println(ql.tinhDienTichTB());

        int idx = ql.timHinh(new HinhVuong("HCN", 40));
        System.out.println(idx);

    }
}

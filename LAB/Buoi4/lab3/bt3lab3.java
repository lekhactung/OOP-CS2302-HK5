/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author admin
 */
public class bt3lab3 {

    public static void main(String[] args) {
        QLSanPham ql = new QLSanPham();
        ql.themSP(new Sach("OOP", 100, 156));
        ql.themSP(new BangDia("MMT", 60, 120));
        ql.themSP(new Sach("CTDL", 200, 199));
        ql.themSP(new Sach("CSDL", 259, 220));
        ql.themSP(new Sach("GT", 99, 90));
        ql.themSP(new BangDia("DSTT", 89, 60));
        ql.hienThi();
        System.out.println("====");
        ql.timKiem("T").forEach(s -> s.hienThi());
//        ql.timKiem(4).hienThi();
//        ql.xoaSP("OOP");
//        ql.hienThi();
//        ql.sapXep();
//        ql.hienThi();
    }
}

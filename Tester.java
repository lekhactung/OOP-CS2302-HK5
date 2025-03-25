/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lkt.hv;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author admin
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
//        HocVien hv1 = new HocVien("Nguyen Van A", "09/11/2005");
//        HocVien hv2 = new HocVien("Pham Thi B", LocalDate.of(2005, Month.OCTOBER, 7));
        QuanLiHocVien ql = new QuanLiHocVien();
//        ql.themHv(hv1, hv2);
//        ql.hienThi();
        ql.themHv("src/main/recources/data.txt");
//        ql.themHv();
        ql.hienThi();
        System.out.println("========");
        ql.nhapDiem();
        ql.hienThi();
    }
}

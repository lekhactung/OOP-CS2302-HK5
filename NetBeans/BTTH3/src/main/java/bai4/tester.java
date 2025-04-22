/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.math.BigDecimal;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        QLTaiKhoan ql = new QLTaiKhoan();
        ql.themTK(new TaiKhoan("Le Khac Tung", new BigDecimal("1200000")));
        ql.themTK(new TKCoKyHan("Le Khac A", new BigDecimal("1100000"), KyHan.MOT_THANG));
        ql.xuatDSTK();

        ql.timKiem("000001").napTien(new BigDecimal("129000"));
        ql.xuatDSTK();
        ql.timKiem("000001").rutTien(new BigDecimal("100000"));
        ql.timKiem("000002").rutTien(new BigDecimal("100000"));
        ql.xuatDSTK();
    }
}

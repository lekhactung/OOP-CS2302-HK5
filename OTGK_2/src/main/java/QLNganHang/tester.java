/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNganHang;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        QLTK ql = new QLTK();
        TaiKhoan t1 = new TaiKhoanKhongKyHan("Le Khac Tung", 10000);
        TaiKhoan t2 = new TaiKhoanCoKyHan("Tran Minh Triet", 900, KyHan.MOT_THANG);
        TaiKhoan t3 = new TaiKhoanKhongKyHan("Tran Ngoc Hoang Huy", 300);
        TaiKhoan t4 = new TaiKhoanCoKyHan("Vu Minh Duc", 70, KyHan.MOT_TUAN);
        ql.themTK(t1, t2, t3, t4);
        System.out.println("===a)====");
        ql.hienThi();
        System.out.println("===b)====");
        ql.timKiem("Tran").forEach(t -> t.hienThi());
        System.out.println("===c)====");
        t1.nopTien(999);
        t2.nopTien(19);
        ql.hienThi();
        System.out.println("===d)====");
        t1.rutTien(9);
        ql.hienThi();
        System.out.println("===e)====");
        System.out.printf("%.1f\n", t1.tinhLai());
        System.out.printf("%.1f\n", t2.tinhLai());

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaiKhoanNH;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoanCoKyHan("Le Tung", 8000, KyHan.MOT_TUAN);
        TaiKhoan t2 = new TaiKhoanKhongKyHan("Huy Duong", 10000);
        TaiKhoan t3 = new TaiKhoanCoKyHan("Minh Triet", 28110, KyHan.MOT_THANG);
        QLTaiKhoan ql = new QLTaiKhoan();
        System.out.println("==== a) ===");
        ql.themTK(t1, t2, t3);
        ql.hienThi();
        System.out.println("==== b) ===");
        ql.timKiem("000001").forEach(t -> t.hienThi());
        System.out.println("==== c) ===");
        t1.napTien(800);
        t2.napTien(999);
        t3.napTien(90);
        ql.hienThi();
        System.out.println("==== d) ===");
        t2.rutTien(900);
        t1.rutTien(1);
        ql.hienThi();
        System.out.println("==== e) ===");
        System.out.printf("%.1f",t1.tinhLai());

    }

}

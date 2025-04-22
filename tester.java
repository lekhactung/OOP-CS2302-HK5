/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bai4;

/**
 *
 * @author admin
 */
public class tester {
    
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoanKhongKyHan("Le Tung", 5000);
        TaiKhoan t2 = new TaiKhoanCoKyHan("Minh Triet", 100000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TaiKhoanCoKyHan("Hoang Huy", 300000, KyHan.MOT_THANG);
        QLTaiKhoan ql = new QLTaiKhoan();
        t1.nopTien(500);
        t2.nopTien(200);
        ql.themTK(t1, t2, t3);
        ql.hienThi();
        
        System.out.printf("Lai :%.1f ", t1.tinhLai());
    }
}

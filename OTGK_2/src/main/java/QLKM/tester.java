/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) throws ClassNotFoundException {
        QLSP ql = new QLSP();
        SanPham s1 = new SanPham("SP 01", 80);
        SanPham s2 = new SanPham("SP 02", 100);
        SanPham s3 = new SanPham("SP 03", 50);
        SanPham s4 = new SanPham("SP 04", 65);
        SanPham s5 = new SanPham("SP 05", 20);
        KhuyenMai k1 = new KhuyenMaiA(0.3);
        KhuyenMai k2 = new KhuyenMaiB("Hoa", "Xe");
        KhuyenMai k3 = new KhuyenMaiA(0.3);
        KhuyenMai k4 = new KhuyenMaiB("500K", "Free Meal");
        KhuyenMai k5 = new KhuyenMaiB("Voucher");
        System.out.println("====a)====");
        ql.themSP(s1, s2, s3, s4, s5);
        ql.hienThi();
        System.out.println("====b)====");
        s1.themKM(k1, k2);
        s4.themKM(k5, k4,k1);
        s5.themKM(k1);
        ql.hienThi();
        System.out.println("====c)====");
        ql.timKiem(1).hienThi();
        System.out.println("====d)====");   
        ql.timKiemTheoKM("QLKM.KhuyenMaiB").forEach(k -> k.hienThi());
        System.out.println("====e)====");
        ql.sapXep();
        ql.hienThi();
    }
}

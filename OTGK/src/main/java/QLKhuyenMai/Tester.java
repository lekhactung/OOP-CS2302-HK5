/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKhuyenMai;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class Tester {

    public static void main(String[] args) throws ClassNotFoundException {
        SanPham sp1 = new SanPham("SP 01", 80);
        SanPham sp2 = new SanPham("SP OU 02", 90);
        SanPham sp3 = new SanPham("SP OU 03", 60);
        System.out.println("=== a) ====");
        QLSanPham ql = new QLSanPham();
        ql.themSP(sp1, sp2, sp3);
        ql.hienThi();
        System.out.println("=== b) ====");
        KhuyenMai k1 = new KhuyenMaiA(0.4);
        KhuyenMai k2 = new KhuyenMaiB(Arrays.asList("But", "Ly"));
        sp1.themKM(k1);
        sp2.themKM(k1, k2);
        sp3.themKM(k2);
        ql.hienThi();
        System.out.println("=== c) ====");
        System.out.println("Danh sach KM SP ID 1");

        SanPham kq1 = ql.timKiem(1);
        kq1.getDskm().forEach(s -> System.out.println(s));
        System.out.println("Danh sach KM SP co OU trong ten");

        List<SanPham> kq2 = ql.timKiem("02");
        for (var k : kq2) {
            k.getDskm().forEach(s -> System.out.println(s));
        }
        System.out.println("=== d) ====");
        List<SanPham> kq3 = ql.timKiemTheoMaKM("QLKhuyenMai.KhuyenMaiB");
        kq3.forEach(k -> k.hienThi());
        System.out.println("=== e) ====");
        ql.sapXep();
        ql.hienThi();

    }

}

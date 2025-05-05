/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

/**
 *
 * @author LE TUNG
 */
public class main {

    public static void main(String[] args) {
        TaiLieuDienTu t1 = new Video("OOP LAB1", "leetunnn", 2019, 90, ChatLuongVideo.HD);
        TaiLieuDienTu t2 = new Podcast("Cach lam giau", "Vu Minh Duc", 2024, 3, 40);
        TaiLieuDienTu t3 = new eBook("OOP", "Duong Huu Thanh", 2022, 180, DinhDang.PDF);
        TaiLieuDienTu t4 = new Podcast("Bao lau ban dc 1 ty goi me", "Hoang Huy", 2020, 1, 80);
        NguoiDung n1 = new NguoiDung("LK Tung", "abc@gmail.com");
        NguoiDung n2 = new NguoiDung("TminT", "tmint@gmail.com");
        NguoiDung n3 = new NguoiDung("HHuy", "hhuy@gmail.com");

        QLNoiDungSo ql = new QLNoiDungSo();
        System.out.println("=====a)====");
        ql.themTaiLieu(t1, t2, t3, t4);
        ql.hienThiTaiLieu();
        System.out.println("=====XOA)====");
//        ql.xoaNoiDung("CONTENT00002");
        ql.hienThiTaiLieu();
        System.out.println("=====b)====");
        ql.hienThi5NamGanNhat();
        System.out.println("=====c)====");
        ql.themNguoiDung(n1, n2, n3);
//        ql.hienThiNguoiDung();
        n1.themTaiLieuYeuThich(t4);
        n2.themTaiLieuYeuThich(t4);
        n1.themTaiLieuYeuThich(t3);
//        n2.themTaiLieuYeuThich(t3);
        n2.themTaiLieuYeuThich(t2);
        n2.themTaiLieuYeuThich(t1);
        n3.themTaiLieuYeuThich(t1);
        n1.themTaiLieuYeuThich(t3);
        n1.themTaiLieuYeuThich(t1);
        ql.danhSachNguoiDungThicheBook().forEach(n -> n.hienThi());
        System.out.println("=====d)====");
        ql.videoTren3YeuThich();
        System.out.println("=====f)====");
//        ql.sapXep().forEach(t -> t.hienThi());
        ql.hienThiNoiDungSX();
    }
}

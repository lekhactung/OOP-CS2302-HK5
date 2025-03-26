/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lkt.tungbtth3;

import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class bai6 {

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(2, 4);
        PhanSo p2 = new PhanSo(4, 5);
        PhanSo p3 = new PhanSo(3, 6);
        PhanSo p4 = new PhanSo(8, 2);
        PhanSo p5 = new PhanSo(1, 9);
        PhanSo p6 = new PhanSo(4, 7);
        PhanSo p7 = new PhanSo(1, 8);
        QuanLiPhanSo ql = new QuanLiPhanSo();
        ql.themPS(p1, p2, p3, p4, p5, p6, p7);
        ql.hienThi();
        System.out.println("");
        ql.xoaPS(1,9);
        ql.hienThi();
        System.out.println("");
        ql.tinhTong();
        PhanSo max = ql.getMax();
        max.hienThi();
        PhanSo tong = ql.tinhTong();
        tong.hienThi();
        
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung;

import lkt.btth2_tung.lib2.PhanSo;

/**
 *
 * @author admin
 */
public class bt5 {

    public static void main(String[] args) {
//        PhanSo ps1 = new PhanSo(1, 2);
//        ps1.hienThiPS();
//        PhanSo ps2 = new PhanSo(1, 4);
//        ps2.hienThiPS();
//        System.out.println(ps1.soSanh(ps2));
//        PhanSo result = ps1.cong(ps2);
//        result.hienThiPS();
        int n = 5;
        PhanSo[] ps = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 5 + 1);
            int y = (int) (Math.random() * 10 + 1);
            PhanSo tmp = new PhanSo(x, y);
            ps[i] = tmp;
            ps[i].rutGon();
        }
        for (PhanSo p : ps) {
            p.hienThiPS();
        }
        System.err.println("//////////");

        PhanSo tong = new PhanSo();

        tong.hienThiPS();
        tong.rutGon();
        tong.hienThiPS();s
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung;

import lkt.btth2_tung.lib2.Diem;
import lkt.btth2_tung.lib2.DoanThang;

/**
 *
 * @author admin
 */
public class bt2 {

    public static void main(String[] args) {
        DoanThang dt1 = new DoanThang(new Diem(0, 1), new Diem(0, 5));
        dt1.hienThi();
        double doDai = dt1.tinhDoDai();
        System.out.println(doDai);
        Diem trungDiem = dt1.timTrungDiem();
        trungDiem.hienThi();
        DoanThang dt2 = new DoanThang(new Diem(5, 1), new Diem(5, 10));
        System.out.println(dt1.isParallel(dt2));
    }

}

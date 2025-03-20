/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung;

import lkt.btth2_tung.lib2.Diem;

/**
 *
 * @author admin
 */
public class bt1 {
    public static void main(String[] args) {
        Diem d1 = new Diem(1,3);
        Diem d2 = new Diem(4,6);
        d1.hienThi();
        d2.hienThi();
        double kc = d1.distance(d2);
        System.out.printf("%.1f",kc);
        
    }
}

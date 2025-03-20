/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung;

import lkt.btth2_tung.lib2.Diem;
import lkt.btth2_tung.lib2.HinhChuNhat;

/**
 *
 * @author admin
 */
public class bt3 {
    
    public static void main(String[] args) {
    Diem d1 = new Diem(0,5);
    Diem d2 = new Diem(3,5);
    HinhChuNhat hcn = new HinhChuNhat(d1, d2);
    hcn.hienThi();
    }
}

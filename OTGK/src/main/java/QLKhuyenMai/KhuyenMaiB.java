/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKhuyenMai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class KhuyenMaiB extends KhuyenMai {

    private List<String> dichVu = new ArrayList<>();

    public KhuyenMaiB(List<String> dichVu) {
        this.maKM = String.format("B%d - ", (int) (Math.random() * 9999 + 1000));
        this.dichVu = dichVu;
    }

    @Override
    public String toString() {
        String s = super.toString();
        for (var d : this.dichVu) {
            s += String.format("%s \t", d);
        }
        return s;
    }
}

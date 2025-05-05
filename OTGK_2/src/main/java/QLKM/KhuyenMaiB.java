/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class KhuyenMaiB extends KhuyenMai {

    private List<String> dichVuKM = new ArrayList<>();

    @Override
    public String toString() {
        String s = super.toString();
        for(var d : this.dichVuKM){
            s += String.format("\t%s",d);
        }
        return s;
    }

    public KhuyenMaiB(String... a) {
        maKM = String.format("-B%04d", (int) (Math.random() * 9999 + 100));
        this.dichVuKM.addAll(Arrays.asList(a));
    }

}

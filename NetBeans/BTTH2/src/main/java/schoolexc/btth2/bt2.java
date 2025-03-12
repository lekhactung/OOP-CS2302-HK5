/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth2;

import schoolexc.btth2.lib2.DoanThang;
import schoolexc.btth2.lib2.Diem;

/**
 *
 * @author LE TUNG
 */
public class bt2 {

    public static void main(String[] args){
        DoanThang dt1 = new DoanThang(new Diem(1, 2), new Diem(3, 4));
        DoanThang dt2 = new DoanThang(new Diem(5, 6), new Diem(7, 8));
        System.out.print(DoanThang(dt1,dt2));
    }

}

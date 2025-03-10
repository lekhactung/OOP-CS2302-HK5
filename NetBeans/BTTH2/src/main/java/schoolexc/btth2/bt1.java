/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package schoolexc.btth2;

import schoolexc.btth2.lib2.HCN;

/**
 *
 * @author LE TUNG
 */
public class bt1 {

    public static void main(String[] args) {
        HCN hcn = new HCN(4,5);
        double cv = hcn.chuVi();
        double dt = hcn.dienTich();
        System.out.println(cv +" ||| " + dt);
    }
}

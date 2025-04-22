/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.math.BigDecimal;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        QLGV ql = new QLGV();
        ql.themGV(new GiangVienCoHuu("Le Tung",
                "07/10/2005",
                "Giao Su", //hoc ham
                "Thac Si",//hoc vi
                "22/10/2020" // ngay bdau
                ,
                 new BigDecimal("100000") // luong co ban
                ,
                 100 // so gio lam
                ,
                 1.5));// he so luong
        ql.themGV(new GiangVienThinhGiang("Le Khac Tung",
                "07/10/2005",
                "Giao Su", //hoc ham
                "Thac Si",//hoc vi
                "22/10/2020", // ngay bdau
                50,
                "Dong Nai"));
        ql.luongGV();
        ql.hienThi();
    }

}

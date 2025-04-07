/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth3;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
        QuanLiHocVien ds = new QuanLiHocVien();
//        HocVien hv1 = new HocVien("Le Khac Tung", "07/10/2005");
//        HocVien hv2 = new HocVien("Tran Minh Triet", "07/11/2005");
        HocVien hv3 = new HocVien("Duong Ngoc Hoang Huy", "09/02/2010");
        HocVien hv4 = new HocVien("Nguyen Huu Phai", "02/12/2015");
        ds.themHV(hv3,hv4);
        ds.themHV("src/main/resources/data.txt");
        ds.hienThi();
//        ds.nhapDiem();
//        ds.hienThi();
//        ds.xuatHB();
//        System.out.println("/////SX//////");
//        ds.sapXep();
//        ds.hienThi();
        System.out.printf("\n%d",ds.countYear1());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author LE TUNG
 */
public class tester {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("0123", "Nguyen Van Nhan", "HCM",  "0123456",NhanVien.GioiTinh.NAM);
        NhanVien nvA = new NhanVienA( "0123","Nguyen Van A", "HCM", "0123456", NhanVien.GioiTinh.NAM);
        NhanVien nvB = new NhanVienB( "0123","Nguyen Van B", "HCM", "0123456", NhanVien.GioiTinh.NAM);
        NhanVien nvC = new NhanVienC( "0123","Nguyen Thi C", "HCM", "0123456", NhanVien.GioiTinh.NU);
        System.out.println(nv);
        System.out.println(nvA);
        System.out.println(nvB);
        System.out.println(nvC);
    }
}

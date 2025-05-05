/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

/**
 *
 * @author LE TUNG
 */
public class tester {

    public static void main(String[] args) {
        Vaccine v1 = new Vaccine("VC01", "USA", 10);
        Vaccine v2 = new Vaccine("VC02", "Russia", 10);
        Vaccine v3 = new Vaccine("VC03", "France", 10);
        Vaccine v4 = new Vaccine("VC04", "China", 10);
        Vaccine v5 = new Vaccine("VC05", "China", 10);
        Vaccine v6 = new Vaccine("VC06", "China", 10);
        Vaccine v7 = new Vaccine("VC07", "USA", 10);
        Vaccine v8 = new Vaccine("VC08", "France", 10);

        NguoiDan n1 = new NguoiDan("01", "Tung", GioiTinh.NAM, "07/10/2005");
        NguoiDan n2 = new NguoiNuocNgoai("02", "Triet", GioiTinh.NAM, "11/02/2005", "NG01", "USA");
        NguoiDan n3 = new NguoiDan("03", "Huy", GioiTinh.NU, "07/12/2005");
        NguoiDan n4 = new NguoiNuocNgoai("04", "Duc", GioiTinh.NAM, "23/09/2005", "NG02", "Japan");

        QLTiemChung ql = new QLTiemChung();
        ql.themVC(v1, v2, v3, v4, v5, v6, v7, v8);
        System.out.println("===a)===");
//        ql.hienThiVC();
        System.out.println("===b)===");
        ql.themNguoiDan(n1, n2, n3, n4);
//        ql.hienThiNguoiNuocNgoai();
        System.out.println("===c)===");
        ql.themMuiTiem(n1, v1, "HCM");
//        ql.themMuiTiem(n1, v3, "HCM");
        ql.themMuiTiem(n1, v3, "HCM");
        ql.themMuiTiem(n3, v5, "HCM");
        ql.themMuiTiem(n4, v1, "HCM");
        ql.themMuiTiem(n3, v4, "HCM");

        System.out.println("===d)===");
        ql.hienThiThongTinTiemChung();
        System.out.println("===e)===");
        ql.kiemTraDKTiem("Tung");
        System.out.println("===f)===");
        ql.sapXep();
    }
}

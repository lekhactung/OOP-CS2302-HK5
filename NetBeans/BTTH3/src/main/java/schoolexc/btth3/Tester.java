/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package schoolexc.btth3;

import java.io.FileNotFoundException;

/**
 *
 * @author LE TUNG
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
//        HocVien hv1 = new HocVien("Nguyen Van A", "09/11/2005");
//        HocVien hv2 = new HocVien("Pham Thi B", LocalDate.of(2005, Month.OCTOBER, 7));
        QuanLiHocVien ql = new QuanLiHocVien();
//        ql.themHv(hv1, hv2);
//        ql.hienThi();
        ql.themHv("src/main/recources/data.txt");
//        ql.themHv();
//        ql.themHv();
//        ql.hienThi();
        System.out.println("========");
        ql.nhapDiem();
        ql.hienThi();
        System.out.println("====Hoc Bong====");
//        ql.timKiem(1).hienThi();
        ql.timKiem().forEach(h -> h.hienThi());

        System.out.println("====SX====");
        ql.sapXep();
        ql.hienThi();
//        ql.xuatHb("src/main/recources/output.txt");
       
    }
}

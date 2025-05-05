/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

import TaiKhoanNH.TaiKhoan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLNoiDungSo {

    private List<TaiLieuDienTu> ds = new ArrayList<>();
    private List<NguoiDung> dsnd = new ArrayList<>();

    public void themTaiLieu(TaiLieuDienTu... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThiTaiLieu() {
        this.ds.forEach(t -> t.hienThi());
    }

    public void themNguoiDung(NguoiDung... a) {
        this.dsnd.addAll(Arrays.asList(a));
    }

    public void hienThiNguoiDung() {
        this.dsnd.forEach(n -> n.hienThi());
    }

    public List<NguoiDung> danhSachNguoiDungThicheBook() {
        return this.dsnd.stream()
                .filter(n -> n.getDsYeuThich()
                .stream()
                .anyMatch(t -> t instanceof eBook))
                .collect(Collectors.toList());
    }

    public void videoTren3YeuThich() {
        for (TaiLieuDienTu t : ds) {
            if (t instanceof Video) {
                long count = dsnd.stream().filter(n -> n.getDsYeuThich().contains(t)).count();

                if (count >= 3) {
                    t.hienThi();
                    System.out.printf("So luot yeu thich : %d\n", count);
                }
            }

        }

    }

    public List<TaiLieuDienTu> sapXep() {
        return this.ds.stream()
                .sorted((t1, t2) -> {
                    long count1 = dsnd.stream().filter(nd -> nd.getDsYeuThich().contains(t1)).count();
                    long count2 = dsnd.stream().filter(nd -> nd.getDsYeuThich().contains(t2)).count();

                    if (count1 != count2) {
                        return Long.compare(count2, count1);
                    }
                    return t1.getMaNoiDung().compareTo(t2.getMaNoiDung());

                }).collect(Collectors.toList());
    }
    
    public void hienThiNoiDungSX(){
        for(TaiLieuDienTu t :sapXep()){
            long soLuot = dsnd.stream().filter(n -> n.getDsYeuThich().contains(t)).count();
            System.out.printf("So luot thich: %d\n",soLuot);
            t.hienThi();
        }
    }

    public void xoaNoiDung(String kw) {
        this.ds.removeIf(t -> t.getMaNoiDung().equals(kw));
    }

    public void hienThi5NamGanNhat() {
        this.ds.stream().filter(t -> (int) (LocalDate.now().getYear()) - t.getNamPhatHanh() <= 5)
                .collect(Collectors.toList()).forEach(t -> t.hienThi());
    }

    public List<TaiLieuDienTu> getDs() {
        return ds;
    }

    public void setDs(List<TaiLieuDienTu> ds) {
        this.ds = ds;
    }

}

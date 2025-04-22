/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLGV {

    private List<GiangVien> ds = new ArrayList<>();

    public void themGV(GiangVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(gv -> System.out.print(gv));
    }

    public List<GiangVien> timKiem(String kw) {
        return this.ds.stream()
                .filter(gv -> gv.getHoTen().toLowerCase().contains(kw.toLowerCase())
                || gv.getHocHam().toLowerCase().equals(kw.toLowerCase())
                || gv.getHocVi().toLowerCase().equals(kw.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<GiangVien> luongGV() {
        return this.ds.stream().sorted((a, b) -> a.tinhLuong().compareTo(b.tinhLuong()))
                .collect(Collectors.toList());
    }

    public List<GiangVien> getDs() {
        return ds;
    }

    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }

}

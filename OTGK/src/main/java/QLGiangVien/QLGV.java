/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLGiangVien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLGV {
    List<GiangVien> ds = new ArrayList<>();

    public void themGV(GiangVien...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(g -> g.hienThi());
    }
    
    public List<GiangVien> timKiem(String kw){
        return this.ds.stream().filter
        ( g -> g.getHoTen().toLowerCase().contains(kw.toLowerCase()) 
                || g.getHocHam().toLowerCase().equals(kw.toLowerCase())
                || g.getHocVi().toLowerCase().equals(kw.toLowerCase())
        ).collect(Collectors.toList());
    }
    
    public List<GiangVien> tinhLuong(){
        return this.ds.stream().sorted((a, b) -> Double.compare(a.tinhLuong(), b.tinhLuong()))
                .collect(Collectors.toList());
    }
    
    public void xoaGV(String kw){
        this.ds.removeIf(gv -> gv.getHoTen().equals(kw));
    }
    
    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }

    public List<GiangVien> getDs() {
        return ds;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNganHang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLTK {
    private List<TaiKhoan> ds = new ArrayList<>();

    public void themTK(TaiKhoan...a){
        this.ds.addAll(Arrays.asList(a));
    }
  
    public void hienThi(){
        this.ds.forEach(t -> t.hienThi());
    }
    
    public List<TaiKhoan> timKiem(String kw){
        return this.ds.stream().filter(t -> t.getStk().equals(kw) 
                || t.getTenTK().toLowerCase().contains(kw.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
    
    
}

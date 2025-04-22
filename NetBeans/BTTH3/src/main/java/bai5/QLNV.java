/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class QLNV {
    private List<NhanVien> ds = new ArrayList<>();
    
    public void themNV(NhanVien...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(nv -> System.out.print(nv));
    }
    
    public void xoaNV(NhanVien nv){
        this.ds.remove(nv);
    }
    
    public List<NhanVien> getDs() {
        return ds;
    }

    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }
    
}

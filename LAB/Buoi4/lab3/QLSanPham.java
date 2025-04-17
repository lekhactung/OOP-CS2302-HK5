/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLSanPham {
    private List<SanPham> ds = new ArrayList<>();
    
    public void themSP(SanPham... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public  void hienThi(){
        this.ds.forEach(s -> s.hienThi());
    }
    
    public void xoaSP(String tenSP){
        this.ds.removeIf(s -> s.getTen().equals(tenSP));
    }
    
    
    public void xoasSP(int id){
        this.ds.removeIf(s -> s.getId() == id);
    }
    
    public List<SanPham> timKiem(String kw){
        return this.ds.stream().filter(h ->h.getTen().contains(kw)).collect(Collectors.toList());
    }
    
    public List<SanPham> timKiem(double from, double to){
        return this.ds.stream().filter(h ->h.getGia() <= to && h.getGia() >= from).collect(Collectors.toList());
    }
    
    public SanPham timKiem(int id){
        return this.ds.stream().filter(h ->h.getId() == id).findFirst().get();
    }
    
    public void sapXep(){
        this.ds.sort((s1,s2)-> {
            return -Double.compare(s1.getGia(), s2.getGia());
        });
    }
    
    
    /**
     * @return the ql
     */
    public List<SanPham> getQl() {
        return ds;
    }

    /**
     * @param ql the ql to set
     */
    public void setQl(List<SanPham> ds) {
        this.ds = ds;
    }
    
}

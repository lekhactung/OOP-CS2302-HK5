/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.tungbtth3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class QuanLiPhanSo {
    private List<PhanSo> ds= new ArrayList<> ();

    public void themPS(PhanSo p){
        this.ds.add(p);
    }
    
    public void themPS(PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(p -> p.hienThi());
    }
    
    public PhanSo getMax(){
        return this.ds.stream().max((p,q) -> p.soSanh(q)).get();
    }
    
    public PhanSo tinhTong(){
        return this.ds.stream().reduce(new PhanSo(),(t,p) -> t.cong(p)).rutGon();
    }
    
    public void xoaPS(PhanSo p){
        this.ds.removeIf(q -> q.soSanh(p) == 0);   
    }
    
    public void xoaPS(int tu,int mau){
        PhanSo p = new PhanSo(tu,mau);
        this.xoaPS(p);
    }
    
    /**
     * @return the ds
     */
    public List<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<PhanSo> ds) {
        this.ds = ds;
    }
    
}

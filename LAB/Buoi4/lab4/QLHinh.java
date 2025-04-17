/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class QLHinh {

    private List<Hinh> ds = new ArrayList<>();

    public void themHinh(Hinh... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(h -> System.out.println(h));
    }

    public void xoaHinh(String ten){
        this.ds.removeIf(h -> h.getTen().equals(ten));
    }
    
    public List<Hinh> timKiem(String tenLop) throws ClassNotFoundException {
        Class c = Class.forName(tenLop);
        return this.ds.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
    }
    

    public void sapXepGiamDan(){
        this.ds.sort((h1,h2)->{
            return -Double.compare(h1.tinhDienTich(),h2.tinhDienTich());
        });
    }
    
    public void sapXep() {
        this.ds.sort((h1, h2) -> {
            if(h1.getTen().equals(h2.getTen())){
                return -Double.compare(h1.tinhDienTich(), h2.tinhDienTich());
            }
            return h1.getTen().compareTo(h2.getTen());
        });
    }

    public int timHinh(Hinh h ){
        return this.ds.indexOf(h);
    }
    
//    public double tinhDienTichTB(){
//       return this.ds.stream().mapToDouble(Hinh::tinhDienTich).average().orElse(0);
//    }
    
    /**
     * @return the ds
     */
    public List<Hinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }

}

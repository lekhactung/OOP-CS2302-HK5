package lkt.tungbtth3;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.lkt.hv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLiHocVien {

    private List<HocVien> ds = new ArrayList<>();

    public void themHv(HocVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themHv() {
        HocVien h = new HocVien();
        h.nhap1HV();
        this.ds.add(h);

    }

    public void themHv(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                ds.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }
    

    public void hienThi() {
        this.ds.forEach(p -> p.hienThi());
    }

    
    public void nhapDiem(){
        this.ds.forEach(h -> h.nhapDiem());
    }
    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }

}

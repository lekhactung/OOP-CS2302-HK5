/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKhuyenMai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class SanPham {

    private static int dem = 0;
    private int maSP  = ++dem;
    private String tenSP;
    private double giaBan;
    private List<KhuyenMai> dskm;

    public SanPham(String tenSP, double giaBan) {
        this.dskm = new ArrayList<>();
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }

    public void hienThi() {
        System.out.printf("%d - %s - %.1f - So KM: %d\n", maSP, tenSP, giaBan,dskm.size());
        this.dskm.forEach(km -> System.out.println(km));
    }

    public void themKM(KhuyenMai... a){
        this.dskm.addAll(Arrays.asList(a));
    }
    
    public boolean isKM(Class c){
        return this.dskm.stream().filter(k -> c.isInstance(k)).count() >0;
    }
    
    /**
     * @return the maSP
     */
    public int getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    /**
     * @return the dskm
     */
    public List<KhuyenMai> getDskm() {
        return dskm;
    }

    /**
     * @param dskm the dskm to set
     */
    public void setDskm(List<KhuyenMai> dskm) {
        this.dskm = dskm;
    }

}

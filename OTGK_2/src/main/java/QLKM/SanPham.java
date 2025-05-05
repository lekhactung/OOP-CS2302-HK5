/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class SanPham {

    private static int cnt = 0;
    private int maSP;
    private String tenSP;
    private double giaSP;
    private List<KhuyenMai> khuyenMai = new ArrayList<>();

    public SanPham(String tenSP, double giaSP) {
        this.maSP = ++cnt;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public void themKM(KhuyenMai... a) {
        this.khuyenMai.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        System.out.printf("%s - %s - %.1f\n", maSP, tenSP, giaSP);
        if (!khuyenMai.isEmpty()) {
            khuyenMai.forEach(k -> System.out.println(k));
        }
    }

    public boolean isKM(Class c) {
        return this.khuyenMai.stream().filter(k -> c.isInstance(k)).count() > 0;
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
     * @return the giaSP
     */
    public double getGiaSP() {
        return giaSP;
    }

    /**
     * @param giaSP the giaSP to set
     */
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    /**
     * @return the khuyenMai
     */
    public List<KhuyenMai> getKhuyenMai() {
        return khuyenMai;
    }

    /**
     * @param khuyenMai the khuyenMai to set
     */
    public void setKhuyenMai(List<KhuyenMai> khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

}

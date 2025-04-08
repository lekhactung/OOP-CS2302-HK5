
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh {

    private double chieuDai, chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HinhChuNhat) {
            HinhChuNhat h = (HinhChuNhat) obj;
            return super.equals(obj) && Double.compare(this.chieuDai, h.chieuDai) == 0 && Double.compare(this.chieuRong, h.chieuRong) == 0; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.chieuDai) ^ (Double.doubleToLongBits(this.chieuDai) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.chieuRong) ^ (Double.doubleToLongBits(this.chieuRong) >>> 32));
        return hash;
    }

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

}

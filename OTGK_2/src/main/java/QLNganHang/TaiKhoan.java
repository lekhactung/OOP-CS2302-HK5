/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNganHang;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public abstract class TaiKhoan {

    private static int dem = 0;
    private String stk;
    private String tenTK;
    protected double soTien;
    protected LocalDate ngayTaoTK;

    {
        stk = String.format("%05d", ++dem);
    }

    public void hienThi() {
        System.out.printf("STK : %s\nTen TK : %s\nSo tien : %.0f\n", stk, tenTK, soTien);
    }

    public TaiKhoan(String tenTK, double soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
        this.ngayTaoTK = LocalDate.now();
    }

    public abstract boolean isDaoHan();

    public void nopTien(double soTien) {
        if (this.isDaoHan()) {
            this.soTien += soTien;
        }
    }

    public void rutTien(double soTien) {
        if (this.isDaoHan() && this.soTien >= soTien) {
            this.soTien -= soTien;
        }
    }
    
    public abstract double tinhLai();
    /**
     * @return the stk
     */
    public String getStk() {
        return stk;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTaoTK
     */
    public LocalDate getNgayTaoTK() {
        return ngayTaoTK;
    }

    /**
     * @param ngayTaoTK the ngayTaoTK to set
     */
    public void setNgayTaoTK(LocalDate ngayTaoTK) {
        this.ngayTaoTK = ngayTaoTK;
    }

}

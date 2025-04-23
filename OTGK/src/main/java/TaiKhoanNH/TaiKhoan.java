/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaiKhoanNH;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public abstract class TaiKhoan {

    private static int dem = 0;
    private String soTK;
    private String tenTK;
    protected double soTien;

    {
        soTK = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTK, double soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.printf("--------\nSTK : %s\nTen tai khoan : %s\nSo tien : %.0f\n", soTK, tenTK, soTien);
    }

    public void napTien(double st) {
        if (this.isDaoHan()) {
            this.soTien += st;
        }
    }

    public void rutTien(double st) {
        if (this.soTien > st && isDaoHan()) {
            this.soTien -= st;
        }
    }

    public abstract double tinhLai();

    public abstract boolean isDaoHan();

    /**
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.soTK = soTK;
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

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import javax.imageio.plugins.bmp.BMPImageWriteParam;

/**
 *
 * @author LE TUNG
 */
public abstract class GiangVien {

    protected final BigDecimal thuLao = new BigDecimal("90000");
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam, hocVi;
    private LocalDate ngayBDCTac;
    private double soGioLam;

    public GiangVien(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBDCTac, double soGioLam) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBDCTac = ngayBDCTac;
        this.soGioLam = soGioLam;
    }

    public abstract BigDecimal tinhLuong();

    @Override
    public String toString() {
        return String.format("Ho ten : %s\nNgay sinh : %s\nHoc ham : %s\nHoc vi : %s\nNgay BD CTac : %s\n",
                this.hoTen, this.ngaySinh.format(CauHinh.df), hocHam, hocVi, ngayBDCTac.format(CauHinh.df));
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the ngayBDCTac
     */
    public LocalDate getNgayBDCTac() {
        return ngayBDCTac;
    }

    /**
     * @param ngayBDCTac the ngayBDCTac to set
     */
    public void setNgayBDCTac(LocalDate ngayBDCTac) {
        this.ngayBDCTac = ngayBDCTac;
    }

    /**
     * @return the thuLao
     */
    public BigDecimal getThuLao() {
        return thuLao;
    }

    /**
     * @return the soGioLam
     */
    public double getSoGioLam() {
        return soGioLam;
    }

    /**
     * @param soGioLam the soGioLam to set
     */
    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    /**
     * @param thuLao the thuLao to set
     */
}

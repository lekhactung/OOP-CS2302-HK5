/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package QLGiangVien;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public abstract class GiangVien {

    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDauCT;
    protected double thuLao = 90000;
    protected double soGioLam;

    public GiangVien(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, double soGioLam) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDauCT = LocalDate.now();
        this.soGioLam = soGioLam;
    }

    public void hienThi() {
        System.out.printf("Ho ten : %s\nNgay sinh :%s \nHoc ham : %s\nHoc vi :%s\nNgay bat dau cong tac :%s\n",
                hoTen, ngaySinh.format(CauHinh.df), hocHam, hocVi, ngayBatDauCT.format(CauHinh.df));
    }

    

    public abstract double tinhLuong();

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
     * @return the ngayBatDauCT
     */
    public LocalDate getNgayBatDauCT() {
        return ngayBatDauCT;
    }

    /**
     * @param ngayBatDauCT the ngayBatDauCT to set
     */
    public void setNgayBatDauCT(LocalDate ngayBatDauCT) {
        this.ngayBatDauCT = ngayBatDauCT;
    }

    /**
     * @return the thuLao
     */
    public double getThuLao() {
        return thuLao;
    }

    /**
     * @param thuLao the thuLao to set
     */
    public void setThuLao(double thuLao) {
        this.thuLao = thuLao;
    }

}

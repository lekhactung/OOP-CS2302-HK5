/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLGiangVien;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class GiangVienCoHuu extends GiangVien {

    private double LuongCB;
    private double heSoLuong;

    public GiangVienCoHuu(String hoTen, String ngaySinh, String hocHam, String hocVi,double soGioLam, double LuongCB, double heSoLuong) {
        super(hoTen, LocalDate.parse(ngaySinh,CauHinh.df), hocHam, hocVi,soGioLam);
        this.LuongCB = LuongCB;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Loai GV: Giang vien co huu\n-------------");
    }
    
    

    @Override
    public double tinhLuong() {
        return (this.soGioLam * this.thuLao) + (LuongCB*heSoLuong);
    }
    
    

    /**
     * @return the LuongCB
     */
    public double getLuongCB() {
        return LuongCB;
    }

    /**
     * @param LuongCB the LuongCB to set
     */
    public void setLuongCB(double LuongCB) {
        this.LuongCB = LuongCB;
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

}

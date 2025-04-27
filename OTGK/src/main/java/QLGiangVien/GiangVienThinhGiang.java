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
public class GiangVienThinhGiang extends GiangVien {

    private String noiCTacHienTai;

    public GiangVienThinhGiang(String hoTen, String ngaySinh, String hocHam, String hocVi,double soGioLam, String noiCTacHienTai) {
        super(hoTen, LocalDate.parse(ngaySinh,CauHinh.df), hocHam, hocVi,soGioLam);
        this.noiCTacHienTai = noiCTacHienTai;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Loai GV: Giang vien thinh giang\n-------------");
    }

    
    @Override
    public double tinhLuong() {
        return this.thuLao * this.soGioLam;
    }
    
    

    public String getNoiCTacHienTai() {
        return noiCTacHienTai;
    }

    public void setNoiCTacHienTai(String noiCTacHienTai) {
        this.noiCTacHienTai = noiCTacHienTai;
    }

}

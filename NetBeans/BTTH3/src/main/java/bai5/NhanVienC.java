/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import static bai5.NhanVien.getCnt;

/**
 *
 * @author LE TUNG
 */
public class NhanVienC extends NhanVien{
    {   
        this.maSo = String.format("NVA%04d", getCnt());
    }

    public NhanVienC(String cmnd, String hoTen, String queQuan, String sdt, NhanVien.GioiTinh gioiTinh) {
        super(cmnd, hoTen, queQuan, sdt, gioiTinh);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong)*2.5;
    }

    @Override
    public String toString() {
        return String.format("\n%s\nBo Phan C: ",super.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author LE TUNG
 */
public class NhanVienA extends NhanVien {

    {   
        this.maSo = String.format("NVA%04d", getCnt());
    }

    public NhanVienA(String cmnd, String hoTen, String queQuan, String sdt, GioiTinh gioiTinh) {
        super(cmnd, hoTen, queQuan, sdt, gioiTinh);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong)*1.2;
    }

    @Override
    public String toString() {
        return String.format("\n%s\nBo Phan A: ",super.toString());
    }
    
    

}

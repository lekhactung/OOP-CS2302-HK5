/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author admin
 */
public class TaiKhoanKhongKyHan extends TaiKhoan {

    public TaiKhoanKhongKyHan(String tenTK, double soTien) {
        super(tenTK, soTien);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhLai() {
        return (this.soTienTK * 0.1) / (12 * 100);
    }

    @Override
    public void hienThi() {
        super.hienThi();
    }

}

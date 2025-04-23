/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaiKhoanNH;

/**
 *
 * @author LE TUNG
 */
public class TaiKhoanKhongKyHan extends TaiKhoan {

    public TaiKhoanKhongKyHan(String tenTK, double soTien) {
        super(tenTK, soTien);
    }

    @Override
    public double tinhLai() {
        return (this.soTien*0.1)/(12*100);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }

}

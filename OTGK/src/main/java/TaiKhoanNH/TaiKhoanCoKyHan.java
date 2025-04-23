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
public class TaiKhoanCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TaiKhoanCoKyHan(String tenTK, double soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
//                this.ngayDaoHan = LocalDate.now();
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());    
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %s\nNgay dao han : %s\n", this.kyHan, this.ngayDaoHan.format(CauHinh.df));
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.equals(LocalDate.now());
    }

    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

}

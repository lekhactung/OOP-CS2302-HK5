/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import static bai4.KyHan.MOT_TUAN;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TaiKhoanCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TaiKhoanCoKyHan(String tenTK, double soTienTK, KyHan kyHan) {
        super(tenTK, soTienTK);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
//        this.ngayDaoHan = LocalDate.now();

    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.equals(LocalDate.now());
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTienTK);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han : %s\nNgay dao han : %s\n", this.kyHan, this.ngayDaoHan.format(CauHinh.df));
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
